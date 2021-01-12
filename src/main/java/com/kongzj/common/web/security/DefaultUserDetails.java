package com.kongzj.common.web.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

/**
 * @author zjkong@easipay.net
 * @date 2021/1/12 4:08 下午
 */
public class DefaultUserDetails extends User {
    private static final long serialVersionUID = 8055172623857766417L;
    private String id;
    private String email;
    private String phoneNo;

    public DefaultUserDetails(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
    }

    public DefaultUserDetails(String id, String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
        this.id = id;
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNo() {
        return this.phoneNo;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
}
