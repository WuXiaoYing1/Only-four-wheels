package com.experiment.article.Entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


@TableName("user")
public class User {
//    如果要加字段数据库加上去就行
    String username;
    String password;
}
