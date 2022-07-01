package com.weifj.springboothello.service;

import com.weifj.springboothello.dao.UserRepository;
import com.weifj.springboothello.entity.User;

import java.util.List;

public interface UserService {

    public void save(User user);

    public List<User> findAll();

}
