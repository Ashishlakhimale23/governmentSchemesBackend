package com.example.myapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private String email;
    private String password;

    Users(){}

    public Users(String name ,String email,String password){
        this.email = email;
        this.name = name ;
        this.password = password;

    }

    public Long getId(){return this.id;};
    public void setId(Long id){this.id = id;};
    public String getName(){return this.name;};
    public void setEmail(String email){ this.email = email;};
    public void setName(String name){this.name = name;};
    public String getEmail(){return this.email;};
    public String getPassword(){return this.password;};
    public void setPassword(String password){this.password = password;};


    
}
