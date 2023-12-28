package com.cydeo.repository;

import com.cydeo.entity.Department;
import net.bytebuddy.implementation.bytecode.Division;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;


public interface DepartmentRepository extends JpaRepository<Department,String> {

    //Display all departments in the furniture department
    Department findByDepartment(String department);

    //Display all departments in the health division
    List<Department> findByDivision(String division);
    List<Department> findByDivisionIs(String division);
    List<Department> findByDivisionEquals(String division); //bu uc methodda ayni

    //Display all departments with division name ends with 'ics'
    List<Department> findByDivisionEndingWith(String pattern);

    //Display top three departments with division name includes 'Hea' without duplicates
    List<Department> findDistinctTop3ByDivisionContains(String pattern);
    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> retrieveDepartmentDivision(List<String> division);
}
