package com.techfolks.request;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginReq {

    private String phoneNumber, password;
}
