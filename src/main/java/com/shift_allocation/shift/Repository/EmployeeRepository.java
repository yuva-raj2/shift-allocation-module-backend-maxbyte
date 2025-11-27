package com.shift_allocation.shift.Repository;
import com.shift_allocation.shift.Entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
