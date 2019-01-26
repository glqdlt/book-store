package com.glqdlt.bookstore.api.entity.auth;

import java.io.Serializable;

/**
 * 유저의 권한에 따른 세부 기능
 * @author glqdlt
 */
public class Scope implements Serializable{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
