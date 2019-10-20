package com.yafeng.genericbackend.service;

import com.yafeng.genericbackend.base.BaseService;
import com.yafeng.genericbackend.bean.entity.User;

/**
 * project_name: paperbackend
 * package: com.yafeng.paperbackend.service
 * describe: 由开发人员自主完善
 *
 * @author : songyafeng
 * creat_time: 2019/10/6 20:13
 **/
public interface UserService extends BaseService<User> {
    /**
     * 通过邮箱查找
     * @param email
     * @return
     */
    User selectByEmail(String email);

    /**
     * 修改头像
     * @param user
     * @return
     */
    int updateAvatar(User user);

    /**
     * 激活账户
     * @param email
     * @return
     */
    int activateUser(String email);

    /**
     * 修改密码
     * @param email
     * @param password
     * @return
     */
    int resetPassword(String email, String password);
}
