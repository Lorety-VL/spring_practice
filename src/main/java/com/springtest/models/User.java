package com.springtest.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Setter
    @Getter
    private String first_name;
    @Setter
    @Getter
    private String last_name;
    @Setter
    @Getter
    private String age;

}
