package com.example.mysecurity.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * (SardlineRole)实体类
 *
 * @author makejava
 * @since 2020-10-10 10:40:57
 */
@TableName("sardline_role")
public class SardlineRole implements Serializable {
    private static final long serialVersionUID = 267587044720991004L;
    /**
    * 角色id
    */
    @TableId(type = IdType.UUID)
    private String roleId;
    /**
    * 角色名
    */
    private String roleName;
    /**
    * 描述
    */
    private String description;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}