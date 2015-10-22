package pers.futuremac.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.futuremac.domain.User;
import pers.futuremac.mapper.UserMapper;

/**
 * Created by 前程 on 2015/10/22.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper mapper;

    public User getUser(String id){
        return mapper.getUser(id);
    }
}
