package com.yuanziren.dao;

import com.yuanziren.po.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

/**
 * Created by xlf on 2019/5/30.
 */
public class UserDaoImplTest {

    SqlSessionFactory sqlSessionFactory;
    UserDaoImpl userDao;

    @Before
    public void init() throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(in);
        userDao = new UserDaoImpl(sqlSessionFactory);
    }


    @Test
    public void queryUserById() throws Exception {
        User user = userDao.queryUserById(6);
        System.out.println(user);
    }

    @Test
    public void queryUserByName() throws Exception {
        User user = userDao.queryUserByName("jackie02");
        System.out.println(user);
    }

    @Test
    public void queryUserByUser() throws Exception {
        User user1 = new User();
        user1.setUserName("jackie02");
        User user = userDao.queryUserByUser(user1);
        System.out.println(user);
    }

    @Test
    public void queryUserByMap() throws Exception {
        Map map = new HashMap();
        map.put("userName", "jackie02");

        User user = userDao.queryUserByMap(map);
        System.out.println(user);
    }

    @Test
    public void queryUserByNameAndId() throws Exception {
        User user = userDao.queryUserByNameAndId(6, "jackie02");
        System.out.println(user);
    }

    @Test
    public void queryUserTotal() throws Exception {
        Integer total = userDao.queryUserTotal();
        System.out.println("total: " + total);
    }

    @Test
    public void queryUserNameById() throws Exception {
        String userName = userDao.queryUserNameById(6);
        System.out.println("userName: " + userName);
    }

    @Test
    public void queryUserMapById() throws Exception {
        Map map = userDao.queryUserMapById(6);
        System.out.println(map.toString());
        System.out.println(map.get("user_name"));
    }

    @Test
    public void queryUserList() throws Exception {
        List<User> userList = userDao.queryUserList();
        System.out.println(userList.toString());
    }

    @Test
    public void addUserNoKey() throws Exception {

        User user = new User();
        user.setUserName("songjiang_fage");
        user.setUserPwd("123456");
        user.setNation("china");

        Integer total = userDao.addUserNoKey(user);
        System.out.println(total);
    }

    @Test
    public void addUserHasKey() throws Exception {

        User user = new User();
        user.setUserName("songjiang_fage");
        user.setUserPwd("123456");
        user.setNation("china");

        Integer total = userDao.addUserHasKey2(user);
//        Integer total = userDao.addUserHasKey(user);
        System.out.println(total);
        System.out.println("id: " + user.getId());// 获取添加之后的id值

    }

    @Test
    public void addUserBatch() throws Exception {

        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setUserName("zhiling_0" + i);
            user.setUserPwd("123456");
            user.setNation("china");
            userList.add(user);
        }

        Integer total = userDao.addUserBatch(userList);
        System.out.println(total);

    }

    @Test
    public void updateUserById() throws Exception {

        User user = new User();
        user.setUserName("cuihua");
        user.setId(118);

        Integer total = userDao.updateUserById(user);
        System.out.println(total);

    }

    @Test
    public void updateUserPwd() throws Exception {

        Integer[] ids = {115,116,117,118};
        Integer total = userDao.updateUserPwd(ids);
        System.out.println(total);

    }

    @Test
    public void deleteUserById() throws Exception {

        Integer total = userDao.deleteUserById(118);
        System.out.println(total);

    }

    @Test
    public void deleteUserBatch() throws Exception {

        Integer[] ids = {115,116,117,118};
        Integer total = userDao.deleteUserBatch(ids);
        System.out.println(total);

    }

}