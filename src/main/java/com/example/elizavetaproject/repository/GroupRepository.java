package com.example.elizavetaproject.repository;

import com.example.elizavetaproject.entity.Group;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupRepository extends JpaRepository<Group, Integer> {
}
