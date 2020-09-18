package com.pan.entity;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
/**
 * 菜单管理
 * @author tangpan
 */
@TableName("sys_menu")
public class SysMenuEntity extends BaseEntity implements Serializable {

    private static final long serialVersionUID = 1L;
    /* 父节点id */
    private Long parentId;
    /* 菜单名称 */
    private String name;
    /* 菜单路径 */
    private String url;
    /* shiro授权(多个用逗号分隔，如：user:list,user:create) */
    private String perms;
    /* 菜单类型   0：目录   1：菜单   2：按钮  */
    private Integer type;
    /* 图标路径 */
    private String icon;
    /* 排序 */
    private Integer orderNum;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }
}