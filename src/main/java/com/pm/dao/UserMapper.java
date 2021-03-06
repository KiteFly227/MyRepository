package com.pm.dao;

import java.util.Map;

import com.pm.entity.User;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    User selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table pm_user
     *
     * @mbggenerated Sun Oct 01 05:22:50 GMT+08:00 2017
     */
    int updateByPrimaryKey(User record);
    
    int selectCountByAdminAndPassword(Map<String,String> map);
   
}