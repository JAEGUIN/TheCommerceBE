package com.jaeguin.commerce.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Getter @Builder
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserDTO {

    private String password;
    private String nickname;
    private String name;
    private String phonenumber;
    private String email;
    private LocalDateTime updateTime;
}
