package com.example.repository;

import com.example.entity.AppUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by A.A.MAMUN on 6/24/2020.
 */
@Transactional
public interface AppUserRepository extends CrudRepository<AppUser, String> {
    @Query("select user from AppUser user where user.email=?1") // optional
    AppUser findAppUserBy(String email);
}
