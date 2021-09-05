package com.clearsky.ssm.dao;

import com.clearsky.ssm.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<User> findAll();
}
