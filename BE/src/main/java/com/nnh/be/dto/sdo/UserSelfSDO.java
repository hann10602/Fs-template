package com.nnh.be.dto.sdo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserSelfSDO {
    private Long id;
    private String username;
    private String password;
}
