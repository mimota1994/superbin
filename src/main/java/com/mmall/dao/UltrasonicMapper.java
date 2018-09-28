package com.mmall.dao;

import com.mmall.pojo.Ultrasonic;

public interface UltrasonicMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Ultrasonic record);

    int insertSelective(Ultrasonic record);

    Ultrasonic selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Ultrasonic record);

    int updateByPrimaryKey(Ultrasonic record);
}