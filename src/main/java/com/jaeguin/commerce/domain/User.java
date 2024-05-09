package com.jaeguin.commerce.domain;

import jdk.jshell.Snippet;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import javax.persistence.*;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
@Getter @Builder
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long seq;

    @Column(nullable = false, length = 30)
    private String id;

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String nickname; //닉네임

    @Column(nullable = false, length = 30)
    private String name;

    @Column(nullable = false, length = 100)
    private String phonenumber;

    @Column(nullable = false, length = 100)
    private String email;

    @CreatedDate
    @Column(updatable = false)
    private LocalDateTime regiTime;

    @CreatedDate
    @LastModifiedDate
    private LocalDateTime updateTime;

    public void update(LocalDateTime updateTime, String email, String name, String password, String nickname, String phonenumber, LocalDateTime time) {
        this.updateTime = updateTime;
        this.email = email;
        this.name = name;
        this.password = password;
        this.nickname = nickname;
        this.phonenumber = phonenumber;
        this.updateTime = LocalDateTime.now();
    }
}
