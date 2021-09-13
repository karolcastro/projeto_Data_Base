package com.my.project.model.DTO;

import com.my.project.model.entities.Department;

import java.util.List;

public interface DepartmentDTO {

    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
