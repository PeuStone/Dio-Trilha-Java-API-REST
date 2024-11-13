package me.dio.api_rest_dio.domain.repository;

import me.dio.api_rest_dio.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existByAccountNumber(String accountNumber);
}
