package com.example.library.repository;

import com.example.library.domain.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserEntityRepository {
    int login(UserEntity user);
    UserEntity login2(UserEntity userEntity);
}
