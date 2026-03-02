package in.cg.main.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.cg.main.entities.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>{
}
