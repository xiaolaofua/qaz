package com.example.library.domain;

import org.springframework.stereotype.Component;

import java.util.Objects;

public class UserEntity {
    private int uId;
    private String uName;
    private int uMima;

    public UserEntity( String uName, int uMima) {

        this.uName = uName;
        this.uMima = uMima;
    }

    public UserEntity() {
    }

    public int getuId() {
        return uId;
    }

    public void setuId(int uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getuMima() {
        return uMima;
    }

    public void setuMima(int uMima) {
        this.uMima = uMima;
    }
}
