package com.nowcoder.community.util;

import com.sun.org.apache.xml.internal.resolver.helpers.PublicId;

public class RedisKeyUtil {

    private static final String SPILT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";
    private static final String PREFIX_FOLLOWEE = "followee";
    private static final String PREFIX_FOLLOWER = "follower";
    private static final String PREFIX_KAPTCHA = "kaptcha";
    private static final String PREFIX_TICKET = "ticket";
    private static final String PREFIX_USER = "user";

    //某个实体的赞
    //like:entity:entityType:entityId -> set(userId)
    public static String getEntityLikeKEey(int entityType,int entityId){
        return PREFIX_ENTITY_LIKE + SPILT + entityType + SPILT + entityId;
    }

    //某一个用户的赞
    //like:user:userId -> int
    public static String getUserLikeKey(int userId){
        return PREFIX_USER_LIKE+SPILT+userId;
    }


    //某个用户关注的实体
    //followee:userId:entityType -> zset(entityId,now)
    public static String getFolloweeKey(int userId,int entityType){
        return PREFIX_FOLLOWEE+SPILT+userId+SPILT+entityType;
    }

    //某个实体用户拥有的粉丝
    //follower:entityType:entityId -> zset(userId,now)
    public static String getFollowerKey(int entityType,int entityId){
        return PREFIX_FOLLOWER+SPILT+entityType+SPILT+entityId;

    }

    //登录验证码
    public static String getKaptchaKey(String owner){
        return PREFIX_KAPTCHA+SPILT+owner;
    }

    //登录的凭证
    public static String getTicketKey(String ticket){
        return PREFIX_TICKET+SPILT+ticket;
    }

    //用户
    public static String getUserKey(int userId){
        return PREFIX_USER+SPILT+userId;
    }


}