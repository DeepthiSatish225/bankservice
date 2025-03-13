package com.example.demo.model;


import jakarta.persistence.*;
@Entity
@Table(name = "users")

public class UserAccount {
    @Id
    private int useruniqueId;
    private String username;
    private String password;
    private String name;
    private String age;
    private String address;
    private String email;
    private String gender;
    private String phone;


    public int getUseruniqueId() {
        return useruniqueId;
    }

    public void setUseruniqueId(int useruniqueId) {
        this.useruniqueId = useruniqueId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}

