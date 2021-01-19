package com.diantong4.entity;

import java.io.Serializable;

/**
 * <p>
 * 人员表
 * </p>
 *
 * @author Alicelonely
 * @since 2019-12-01
 */
public class User implements Serializable {

    private Integer id;
    private String name;
    private Integer age;
    /**
     * 0普通1管理员
     */
//    private Integer flag;

    /**被省略的get，set方法**/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
