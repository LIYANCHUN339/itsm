package com.honor.itsm.basic.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.honor.itsm.basic.dto.MapDto;
import com.honor.itsm.basic.dto.UserDto;
import com.honor.itsm.basic.model.User;
import com.honor.itsm.basic.model.UserInfo;
import com.honor.itsm.basic.repository.UserInfoRepository;
import com.honor.itsm.basic.repository.UserRepository;
import com.honor.itsm.basic.service.UserService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserInfoRepository userInfoRepository;
    @Override
    public UserDto getCurrentUser(String userid) {
        UserDto userDto=new UserDto();
        User user= userRepository.findUserByUserId(userid);
         BeanUtils.copyProperties(user,userDto);
        List<UserInfo> list= userInfoRepository.findUserInfoByUserId(userid);
        List<UserInfo> tagList=null;
        List<MapDto> tags=new ArrayList<>();
        //获取当前用户的所有标签
        tagList=list.stream().filter((UserInfo userinfo)-> StringUtils.equals("tag",userinfo.getTypeVal())) .collect(Collectors.toList());
        if(tagList!=null){
            tagList.forEach(userInfo -> {
                MapDto mapDto=new MapDto();
                BeanUtils.copyProperties(userInfo, mapDto);
                tags.add(mapDto);
            });
        }
        userDto.setTags(tags);
        JSONObject jsonObject=new JSONObject();
        Optional<UserInfo> cityOptional = list.stream().filter(item -> StringUtils.equals("city",item.getTypeVal())).findFirst();
        if (cityOptional.isPresent()) {
            MapDto mapDto=new MapDto();
            BeanUtils.copyProperties(cityOptional.get(), mapDto);
            jsonObject.put("city",mapDto);
        }
        Optional<UserInfo> provinceOptional = list.stream().filter(item -> StringUtils.equals("province",item.getTypeVal())).findFirst();
        if (provinceOptional.isPresent()) {
            MapDto mapDto=new MapDto();
            BeanUtils.copyProperties(provinceOptional.get(), mapDto);
            jsonObject.put("province",mapDto);
        }
        userDto.setGeographic(jsonObject);
        return userDto;
    }
}
