package com.honor.itsm.basic.dto;

import lombok.Data;

@Data
public class LoginDto {
    private String status;
    private String currentAuthority;
    private String type;
}
