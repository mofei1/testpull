package test.springsecurity.auth.DTO;

/**
 * jwt令牌中存储的对象，可以附加自己想要的信息
 *
 * 将这个对象存到jwt中主要是JwtAccessTokenConverter这个对象的DefaultUserAuthenticationConverter来实现的
 *
 */
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class JwtUser extends User {

    private String  name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JwtUser(String username, String password, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, authorities);
    }
}
