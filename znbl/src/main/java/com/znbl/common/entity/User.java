package com.znbl.common.entity;

public class User {

    Integer id;
    //名字
    String userName;
    //角色（正，反，观众)
    //String role;

    //改用r_id代替
    Integer r_id;

    //登录密码
    String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

//    public String getRole() {
//        return role;
//    }
//
//    public void setRole(String role) {
//        this.role = role;
//    }
//
//    public User(Integer id, String userName, String role) {
//        this.id = id;
//        this.userName = userName;
//        this.role = role;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", role='" + role + '\'' +
//                '}';
//    }


    public Integer getR_id() {
        return r_id;
    }

    public void setR_id(Integer r_id) {
        this.r_id = r_id;
    }

//    public User(Integer id, String userName, Integer r_id) {
//        this.id = id;
//        this.userName = userName;
//        this.r_id = r_id;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", userName='" + userName + '\'' +
//                ", r_id=" + r_id +
//                '}';
//    }


    public User(Integer id, String userName, Integer r_id, String password) {
        this.id = id;
        this.userName = userName;
        this.r_id = r_id;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", r_id=" + r_id +
                ", password='" + password + '\'' +
                '}';
    }

    public User() {
    }
}
