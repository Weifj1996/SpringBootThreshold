package com.weifj.springboothello.dao;

import com.weifj.springboothello.entity.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private List<User> userDemoList = new ArrayList<>();

    public   void save(User user){
        userDemoList.add(user);
    }

    public List<User> findAll(){
        return userDemoList;
    }
}
