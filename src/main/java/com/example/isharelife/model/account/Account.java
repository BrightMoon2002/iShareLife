package com.example.isharelife.model.account;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
//@Table(name = "accounts", uniqueConstraints = {
//        @UniqueConstraint(columnNames =  {
//                "username"
//        }),
//        @UniqueConstraint(columnNames = {
//                "email"
//        })
//})
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @NotBlank
//    @Size(min = 3, max = 50)
//    private String name;
//    @NotBlank
//    @Size(min = 3, max = 50)
//    private String username;
}
