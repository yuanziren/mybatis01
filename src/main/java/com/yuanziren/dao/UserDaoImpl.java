package com.yuanziren.dao;

import com.yuanziren.mapper.UserMapper;
import com.yuanziren.po.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;
import java.util.Map;

/**
 * Created by xlf on 2019/5/30.
 */
public class UserDaoImpl implements UserMapper {

    private SqlSessionFactory sqlSessionFactory;

    public UserDaoImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User queryUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserById(id);
        return user;
    }

    @Override
    public User queryUserByName(String userName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserByName(userName);
        return user;
    }

    @Override
    public User queryUserByUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user2 = mapper.queryUserByUser(user);
        return user2;
    }

    @Override
    public User queryUserByMap(Map map) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserByMap(map);
        return user;
    }

    @Override
    public User queryUserByNameAndId(Integer id, String userName) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.queryUserByNameAndId(id, userName);
        return user;
    }

    @Override
    public Integer queryUserTotal() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.queryUserTotal();
        return total;
    }

    @Override
    public String queryUserNameById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        String userName = mapper.queryUserNameById(id);
        return userName;
    }

    @Override
    public Map queryUserMapById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Map map = mapper.queryUserMapById(id);
        return map;
    }

    @Override
    public List<User> queryUserList() {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.queryUserList();
        return userList;
    }

    @Override
    public Integer addUserNoKey(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.addUserNoKey(user);
        //sqlSession.commit();// 主动提交事务
        return total;
    }

    @Override
    public Integer addUserHasKey(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.addUserHasKey(user);
        //sqlSession.commit();// 主动提交事务
        return total;
    }
    @Override
    public Integer addUserHasKey2(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.addUserHasKey2(user);
        //sqlSession.commit();// 主动提交事务
        return total;
    }

    @Override
    public Integer addUserBatch(List<User> list) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.addUserBatch(list);
        return total;
    }

    @Override
    public Integer updateUserById(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.updateUserById(user);
        return total;
    }

    @Override
    public Integer updateUserPwd(Integer[] ids) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.updateUserPwd(ids);
        return total;
    }

    @Override
    public Integer deleteUserById(Integer id) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.deleteUserById(id);
        return total;
    }

    @Override
    public Integer deleteUserBatch(Integer[] ids) {
        SqlSession sqlSession = sqlSessionFactory.openSession(true);// 自动提交事务
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        Integer total = mapper.deleteUserBatch(ids);
        return total;
    }
}
