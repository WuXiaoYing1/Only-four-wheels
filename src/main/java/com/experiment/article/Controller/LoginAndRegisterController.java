package com.experiment.article.Controller;

import com.experiment.article.Dao.UserMapper;
import com.experiment.article.Entity.User;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/")
public class LoginAndRegisterController {
   @Resource
    UserMapper userMapper;



   @PostMapping("/register")
    public String addUser(@RequestBody User user){
        userMapper.insert(user);
        return "Success";
    }

    @PostMapping("/login")
    public String getSUser(String username,String password) throws Exception {
        User user = userMapper.findUser(username);
        //有配置异常处理器，但是我还没自定义异常，先用父类测试，或者干脆就返回错误信息给前端
        if( user == null){
//            throw new UsernameNotFoundException("用户名不存在");
//            throw new Exception("用户名不存在");
            return "用户名不存在";
        }

        if(!password.equals(user.getPassword())){
//            throw new PasswordNotException("密码错误");
//            throw new Exception("密码错误");
            return "密码错误";
        }

        return "Success";

    }
}
