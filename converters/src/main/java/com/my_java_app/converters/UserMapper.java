package com.my_java_app.converters;

import com.my_java_app.domain.UserCommand;
import com.my_java_app.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    UserCommand userToUserCommand(User user);
    User userCommandToUser(UserCommand userCommand);
}
