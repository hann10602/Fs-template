package com.nnh.be.service.impl;

import com.nnh.be.dto.sdi.UserSelfSDI;
import com.nnh.be.dto.sdo.UserSelfSDO;
import com.nnh.be.model.User;
import com.nnh.be.repository.UserRepository;
import com.nnh.be.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class IUserService implements UserService {
    @Autowired
    private UserRepository userRepo;

    @Override
    public List<UserSelfSDO> findAll() {
        List<UserSelfSDO> dtoList = new ArrayList<>();

        userRepo.findAll().forEach(entity -> {
            UserSelfSDO dto = new UserSelfSDO();

            BeanUtils.copyProperties(entity, dto);
            dtoList.add(dto);
        });

        return dtoList;
    }

    @Override
    public UserSelfSDO self(Long id) {
        UserSelfSDO res = new UserSelfSDO();

        BeanUtils.copyProperties(userRepo.findById(id), res);

        return res;
    }
}
