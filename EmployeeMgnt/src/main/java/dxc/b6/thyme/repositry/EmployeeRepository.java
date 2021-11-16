package dxc.b6.thyme.repositry;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dxc.b6.thyme.model.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
