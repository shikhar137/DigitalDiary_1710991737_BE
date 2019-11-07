package com.blog.blogbakend.Repository;
import java.util.Optional;
import com.blog.blogbakend.modals.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<Users,Long> {
    Users findByUserid(int userid);
    Optional<Users> findByUsername(String username);
}
