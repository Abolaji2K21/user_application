package africa.semicolon.user_application.repository;

import africa.semicolon.user_application.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}