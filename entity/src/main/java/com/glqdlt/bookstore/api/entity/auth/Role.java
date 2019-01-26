package com.glqdlt.bookstore.api.entity.auth;

import java.io.Serializable;

/**
 * 유저 권한
 * @author glqdlt
 */
public class Role implements Serializable {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;
}
