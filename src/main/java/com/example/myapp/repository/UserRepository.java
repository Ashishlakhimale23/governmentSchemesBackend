package com.example.myapp.repository;
import com.example.myapp.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<Users,Long> {
}
