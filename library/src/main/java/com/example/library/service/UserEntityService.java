package com.example.library.service;

import com.example.library.domain.UserEntity;

public interface UserEntityService {
    int login(UserEntity user);
    UserEntity login2(UserEntity userEntity);
}
