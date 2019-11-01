package com.znbl.pojo;


/**
 * 用户
 */
public class User {

    private String id;

    private String name;

    private Integer roleId;

    private String debateId;

    private Debate debate;

    private Integer num;

    public Integer getNum() {
        return num;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", roleId=" + roleId +
                ", debateId='" + debateId + '\'' +
                ", debate=" + debate +
                ", num='" + num + '\'' +
                '}';
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Debate getDebate() {
        return debate;
    }

    public void setDebate(Debate debate) {
        this.debate = debate;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getDebateId() {
        return debateId;
    }

    public void setDebateId(String debateId) {
        this.debateId = debateId;
    }

    public User() {
    }

    public String getId() {
        return id;

    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




    public User(String id, String name, Integer roleId , String debateId) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
        this.debateId = debateId;
    }

    public User(String id, String name, Integer roleId, String debateId, Debate debate) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
        this.debateId = debateId;
        this.debate = debate;
    }

    public User(String id, String name, Integer roleId, String debateId, Debate debate, Integer num) {
        this.id = id;
        this.name = name;
        this.roleId = roleId;
        this.debateId = debateId;
        this.debate = debate;
        this.num = num;
    }
}
