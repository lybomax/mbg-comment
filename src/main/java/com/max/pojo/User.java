package com.max.pojo;

/**
 * a表
 *
 * @author lyy
 * @date   2019/12/25
 */
public class User {
    /**
     * ID
     */
    private Integer id;

    /**
     * 姓名
     */
    private Integer name;

    /**
     * 信用证编号
     */
    private Integer lcnb;

    /**
     * 获取ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取姓名
     */
    public Integer getName() {
        return name;
    }

    /**
     * 设置姓名
     */
    public void setName(Integer name) {
        this.name = name;
    }

    /**
     * 获取信用证编号
     */
    public Integer getLcnb() {
        return lcnb;
    }

    /**
     * 设置信用证编号
     */
    public void setLcnb(Integer lcnb) {
        this.lcnb = lcnb;
    }
}