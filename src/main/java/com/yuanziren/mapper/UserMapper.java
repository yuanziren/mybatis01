package com.yuanziren.mapper;


import com.yuanziren.po.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    public User queryUserById(Integer id);
    public User queryUserByName(String userName);
    public User queryUserByUser(User user);
    public User queryUserByMap(Map map);
    public User queryUserByNameAndId(@Param("id") Integer id, @Param("userName") String userName);

    public Integer queryUserTotal();
    public String queryUserNameById(Integer id);
    public Map queryUserMapById(Integer id);

    public List<User> queryUserList();


    public Integer addUserNoKey(User user);
    public Integer addUserHasKey(User user);
    public Integer addUserHasKey2(User user);
    public Integer addUserBatch(List<User> list);


    public Integer updateUserById(User user);
    public Integer updateUserPwd(Integer[] ids);

    public Integer deleteUserById(Integer id);
    public Integer deleteUserBatch(Integer[] ids);



}
