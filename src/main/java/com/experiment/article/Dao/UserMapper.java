package com.experiment.article.Dao;

import com.experiment.article.Entity.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.transaction.annotation.Transactional;

public interface UserMapper {

    @Insert("insert into `user`(`username`,`password`) VALUES (#{username},#{password})")
    @Transactional
    void insert(User user);

    @Select("select * from user where username=#{username}")
     User findUser(String username);


}
