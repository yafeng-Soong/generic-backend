# generic-backend
使用spring boot搭建的后端程序，集成了shiro、redis、mybatis、分页、邮件服务等，可用于一些小项目和大学里面的课程设计
## 2019.10.20
鉴于每次使用spring boot搭建后端都要花很久的时间引入和配置各种工具，所以干脆就建立一个通用的前期框架,包含以下功能：<br>
1.整合shiro，并且配置好了拦截、跨域<br>
2.完成了一个简单的用户模块，可以实现用户注册、登录、重置密码等功能，通过邮件激活、修改密码<br>
3.整合mybatis和pageHelper<br>
4.对redis进行了简单的封装<br>
