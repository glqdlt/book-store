package com.glqdlt.booktstroe.webappserver.repository.auth;

import com.glqdlt.bookstore.api.repository.auth.RoleRepository;
import com.glqdlt.booktstroe.webappserver.entity.auth.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleJpaRepo extends RoleRepository, JpaRepository<RoleEntity, String> {

}
