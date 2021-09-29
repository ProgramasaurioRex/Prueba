package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.DepartmentService;
import pe.edu.upc.trabajo.models.entities.Department;
import pe.edu.upc.trabajo.models.repository.DepartmentRepository;
import pe.edu.upc.trabajo.models.repository.JpaRepository;

@Named
@ApplicationScoped
public class DepartmentServiceImpl implements DepartmentService {

	@Inject
	private DepartmentRepository departmentRepository;
	
	@Override
	public JpaRepository<Department, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return departmentRepository;
	}

}
