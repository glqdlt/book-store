package com.glqdlt.booktstroe.webappserver.entity.auth;

import com.glqdlt.bookstore.api.entity.auth.Role;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "tb_role")
@Entity
public class RoleEntity extends Role{

    @Id
    @Column(name = "role")
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
}
