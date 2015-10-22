package pers.futuremac.mapper;

import org.springframework.stereotype.Component;
import pers.futuremac.domain.User;

/**
 * Created by 前程 on 2015/10/22.
 */
@Component
public interface UserMapper {
    public User getUser(String id);
}
