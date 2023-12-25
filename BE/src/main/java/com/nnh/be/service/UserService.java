package com.nnh.be.service;

import com.nnh.be.dto.sdi.UserSelfSDI;
import com.nnh.be.dto.sdo.UserSelfSDO;

import java.util.List;

public interface UserService {
    List<UserSelfSDO> findAll();
    UserSelfSDO self(Long id);
}
