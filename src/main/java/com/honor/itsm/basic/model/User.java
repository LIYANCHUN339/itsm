package com.honor.itsm.basic.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition = "varchar(20) comment '姓名'")
    private String name;

    @Column(columnDefinition = "varchar(100) comment '头像地址'")
    private String avatar;

    @Column(columnDefinition = "varchar(32) comment '用户id'")
    private String userId;

    @Column(columnDefinition = "varchar(64) comment 'email地址'")
    private String email;

    @Column(columnDefinition = "varchar(100) comment '签名'")
    private String signature;

    @Column(columnDefinition = "varchar(32) comment '提示'")
    private String title;

    @Column(columnDefinition = "varchar(100) comment '所属部门组'")
    private String beGroup;

    @Column(columnDefinition = "varchar(255) comment '地址'")
    private String address;

    @Column(columnDefinition = "varchar(32) comment '电话'")
    private String phone;

    @Column(columnDefinition = "varchar(32) comment '国家'")
    private String country;



}