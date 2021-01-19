package com.diantong4.service;

import com.diantong4.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUser();
    String getName();
}
