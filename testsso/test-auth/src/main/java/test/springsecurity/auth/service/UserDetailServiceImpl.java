package test.springsecurity.auth.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import test.springsecurity.auth.DTO.JwtUser;

import java.util.List;

@Service
public class UserDetailServiceImpl implements UserDetailsService {



    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        String password = new BCryptPasswordEncoder().encode("123");

        List<GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("admin,queryAllOrder");


        JwtUser jwtUser = new JwtUser(s, password, authorities);

        jwtUser.setName("张三");

        return jwtUser;
    }



}
