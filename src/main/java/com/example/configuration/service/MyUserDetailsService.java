package com.example.configuration.service;

import com.example.configuration.details.MyUserDetails;
import com.example.entity.AppUser;
import com.example.repository.AppUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * Created by A.A.MAMUN on 6/24/2020.
 */
@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    public AppUserRepository appUserRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AppUser appUser = appUserRepository.findAppUserBy(email);
        if(appUser==null)
            throw new UsernameNotFoundException("User not found.");
        return new MyUserDetails(appUser);
    }
}
