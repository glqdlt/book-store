package com.glqdlt.booktstroe.webappserver.repository.auth;

import com.glqdlt.bookstore.api.repository.auth.RoleRepository;

public interface RoleMybatisDao extends RoleRepository {

    public void insertUser(String name);

}
