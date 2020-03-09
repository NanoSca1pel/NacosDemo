package com.lht.nacos;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author lhtao
 * @date 2020-03-05 20:09
 */
public class PasswordEncoderUtil {
    public static void main(String[] args){
        String pwd = new BCryptPasswordEncoder().encode("123");
        System.out.println(pwd);
    }
}
