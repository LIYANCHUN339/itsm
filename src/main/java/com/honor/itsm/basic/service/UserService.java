package com.honor.itsm.basic.service;

import com.honor.itsm.basic.dto.UserDto;

public interface UserService {
    UserDto getCurrentUser(String userid);
}
