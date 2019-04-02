package com.example.springsecuritydemo.security;

import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * Copyright (C), 2019, 深数意识有限公司
 * FileName: MyPasswordEncoder
 * Author:   Jason chenjb1209@163.com
 * Date:     2019/3/21 16:02
 * Description:
 */
public class MyPasswordEncoder implements PasswordEncoder{

    @Override
    public String encode(CharSequence rawPassword) {
        return null;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
        return true;
    }

    @Override
    public boolean upgradeEncoding(String encodedPassword) {
        return false;
    }
}