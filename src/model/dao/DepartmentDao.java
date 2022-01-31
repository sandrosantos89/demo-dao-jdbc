package model.dao;

import java.util.List;

import model.entitites.Department;

public interface DepartmentDao {
	
	void insert(Department obj);
	void update (Department obj);
	void deleteByID(Integer id);
	Department findById(Integer id);
	List<Department> findAll();
	
}
