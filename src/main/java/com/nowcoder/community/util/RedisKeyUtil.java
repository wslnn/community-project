package com.nowcoder.community.util;

public class RedisKeyUtil {

    private static final String SPILT = ":";
    private static final String PREFIX_ENTITY_LIKE = "like:entity";
    private static final String PREFIX_USER_LIKE = "like:user";

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



}