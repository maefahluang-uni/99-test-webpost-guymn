package lab.webpost.services;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import lab.webpost.domain.User;

public interface UserRepository extends JpaRepository<User, Long> {
    // TODO: add necessary derived methods
    Optional<User> findByUsername(String username);
}
