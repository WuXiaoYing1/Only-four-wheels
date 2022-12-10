package com.experiment.article;

import com.experiment.article.Dao.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class LoginApplicationTests {
    @Resource
    UserMapper userMapper;

    @Test
    void contextLoads() {
        System.out.println(userMapper);
    }

}
