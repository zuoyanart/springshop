package com.company.project.model;

import javax.persistence.*;

@Table(name = "pz_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String userName;

    private String password;

    private  String salt;

    private String nickname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param name
     */
    public void setUserName(String name) {
        this.userName = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     *
     * @param salt
     */
    public void setSalt(String salt) {this.salt = salt;}
}