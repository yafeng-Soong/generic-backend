package com.yafeng.genericbackend.config.Redis;

import com.yafeng.genericbackend.base.BasePrefix;
import lombok.Data;

/**
 * @author liugaoyang
 * @version 1.0.0
 * @description redis中用户前缀
 * @date 2019/10/14 20:11
 */
@Data
public class UserKeyPrefix extends BasePrefix {

    private UserKeyPrefix(String prefix){
        super(prefix);
    }
    private UserKeyPrefix(int expiretime, String prefix){
        super(expiretime, prefix);
    }

    public static UserKeyPrefix Id = new UserKeyPrefix("ID");
    public static UserKeyPrefix Name = new UserKeyPrefix("Name");
    public static UserKeyPrefix TOKEN = new UserKeyPrefix("Token");
    // 访问次数  用来记录某个接口1分钟内的访问次数
    public static UserKeyPrefix COUNT = new UserKeyPrefix(60,"COUNT");
    // 用于构建通用的访问次数限制
    public static UserKeyPrefix count(Integer expireTime){
        return new UserKeyPrefix(expireTime, "COMMONCOUNT");
    }

}
