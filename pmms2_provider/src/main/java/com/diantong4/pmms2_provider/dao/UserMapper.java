package com.diantong4.pmms2_provider.dao;

import com.diantong4.entity.User;

import java.util.List;

public interface UserMapper {

    List<User> getAllUser();
    String getName();
}
