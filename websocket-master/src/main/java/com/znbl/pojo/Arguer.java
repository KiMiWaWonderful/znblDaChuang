package com.znbl.pojo;


/**
 * 辩论者信息
 */
public class Arguer {

    // 辩论赛的id
    private String debateId;

    // 角色，0 为观众，1 2 3 4为正方,-1 -2 -3 -4 为反方
    private Integer roleId;

    public String getDebateId() {
        return debateId;
    }

    public void setDebateId(String debateId) {
        this.debateId = debateId;
    }

    public Integer getroleId() {
        return roleId;
    }

    public void setroleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRole(){
        return roleId == 0?"反方":roleId == 1?"正方":"观众";
    }

    public Arguer(String debateId, Integer roleId) {
        this.debateId = debateId;
        this.roleId = roleId;
    }

    public Arguer() {
    }
}
