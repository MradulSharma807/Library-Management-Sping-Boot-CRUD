package com.mradulsharma.librarymanagemnt.repository;

import com.mradulsharma.librarymanagemnt.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
