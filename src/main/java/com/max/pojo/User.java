package com.max.pojo;

/**
 * 用户
 *
 * @author lyy
 * @date   2019/12/27
 */
public class User {
    /**
     * ID
     */
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 性别
     */
    private String sex;

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
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 设置年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 获取性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }
}