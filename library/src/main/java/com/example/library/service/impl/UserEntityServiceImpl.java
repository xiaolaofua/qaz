package com.example.library.service.impl;

import com.example.library.domain.UserEntity;
import com.example.library.repository.UserEntityRepository;
import com.example.library.service.UserEntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserEntityServiceImpl implements UserEntityService {
    @Autowired
            UserEntityRepository userEntityRepository;

    @Override
    public int login(UserEntity user) {
        return userEntityRepository.login(user);
    }

    @Override
    public UserEntity login2(UserEntity userEntity) {
        return userEntityRepository.login2(userEntity);

    }


}
