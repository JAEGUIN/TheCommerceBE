package com.jaeguin.commerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegiUserDTO {

    private String id;
    private String password;
    private String nickname;
    private String name;
    private String phonenumber;
    private String email;
    private LocalDateTime regiTime;

    public User toEntity() {
        return User.builder()
                .id(id)
                .password(password)
                .nickname(nickname)
                .name(name)
                .phonenumber(phonenumber)
                .email(email)
                .regiTime(LocalDateTime.now())
                .build();

    }
}
