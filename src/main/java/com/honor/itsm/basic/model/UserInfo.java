package com.honor.itsm.basic.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "t_user_info")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(columnDefinition = "varchar(32) comment '用户id'")
    private String userId;
    @Column(name = "label_key",columnDefinition = "varchar(32) comment '标签元素key'")
    private String key;
    @Column(columnDefinition = "varchar(32) comment '标签元素label'")
    private String label;
    @Column(columnDefinition = "varchar(32) comment '类型值'")
    private String typeVal;


}
