package com.honor.itsm.basic.dto;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.Data;

import java.util.List;

@Data
public class UserDto {
    private String name;
    private String avatar;
    private String userId;
    private String email;
    private String signature;
    private String title;
    private String group;
    private List<MapDto> tags;
    private JSONObject geographic;
    private int notifyCount;
    private int unreadCount;
    private String country;
    private String address;
    private String phone;
}
