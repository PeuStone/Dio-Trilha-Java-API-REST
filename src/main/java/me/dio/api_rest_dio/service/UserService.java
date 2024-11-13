package me.dio.api_rest_dio.service;

import me.dio.api_rest_dio.domain.model.User;

public interface UserService {

    User findById(Long id);
    User create(User userToCreate);
}
