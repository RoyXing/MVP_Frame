package com.demo;

import com.yxt.mvp.BaseEntity;

/**
 * @author roy.xing
 * @date 2019-07-02
 */
public class UserInfo extends BaseEntity {

    private String company;
    private String name;

    public UserInfo(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "company='" + company + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
