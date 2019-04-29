package com.example.demo.dao;

import com.example.demo.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
