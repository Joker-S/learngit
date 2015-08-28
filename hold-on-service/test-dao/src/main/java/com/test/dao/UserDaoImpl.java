package com.test.dao;

import com.test.domain.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by songzheqi on 15/8/21.
 */
@Repository
public class UserDaoImpl implements UserDao{
    @Resource
    private SqlSession sqlSession;

    public int insertUser(User user) {
        return sqlSession.insert("insertUser", user);
    }

    public int loginUser(User user) {
        return (Integer)sqlSession.selectOne("loginUser", user);
    }

    public List<User> queryAll() {
        return sqlSession.selectList("queryAll");
    }

    public List<User> queryName(String name) {
        return sqlSession.selectList("queryName");
    }
}
