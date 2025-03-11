package com.example.demo.UserAccount;

import jakarta.persistence.*;

import java.util.List;
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


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    public int getUseruniqueId() {
        return useruniqueId;
    }

    public void setUseruniqueId(int useruniqueId) {
        this.useruniqueId = useruniqueId;
    }

    public UserAccount(int useruniqueId, String username, String password, String name, String age, String address, String email, String phone, String gender)
    {
        this.useruniqueId = useruniqueId;
        this.username=username;
        this.password= password;
        this.name = name;
        this.age = age;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }



    public UserAccount(String name, String age, String address, String mail, String number1) {
    }

    public UserAccount() {}


        public String getName () {
            return name;
        }

        public void setName (String name){
            this.name = name;
        }

        public String getAge () {
            return age;
        }

        public void setAge (String age){
            this.age = age;
        }

        public String getAddress () {
            return address;
        }

        public void setAddress (String address){
            this.address = address;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getGender () {
            return gender;
        }

        public void setGender (String gender){
            this.gender = gender;
        }

        public String getPhone () {
            return phone;
        }

        public void setPhone (String phone){
            this.phone = phone;
        }

    @Override
    public String toString() {
        return "UserAccount{" +
                "useruniqueId=" + useruniqueId +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", gender='" + gender + '\'' +
                ", phone='" + phone + '\'' +
                ", username='" + username + '\'' +
                '}';
    }

    public Object getPassword() {
        return null;
    }
}
