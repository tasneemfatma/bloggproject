package com.blogg.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name="users")
public class User {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int userId;

    @Column(unique=true)
    private String username;

    @Column(unique=true)
    private String email;
    private String password;
}
