# Only-four-wheels

目前加了一个登陆功能,启动项目后在默认路径的表单中
输入账号admin，密码123456
调用接口`http://localhost:8080/login`

以及写了一个Redis的验证码接口,
`http://localhost:8080/code/captcha`,调用时会生成随机的UUID和四位验证码
在`http://localhost:8080/code/check`里面验证生成随机的UUID和四位验证码，成功才返回真

测试用的用户表就两个字段，后续再加

想在还有一个很大的问题，缺少页面安全拦截
可以加拦截器，也可以整合SpringSecurity或者Shiro框架