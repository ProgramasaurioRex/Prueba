package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.Department;
import pe.edu.upc.trabajo.models.repository.DepartmentRepository;

@Named
@ApplicationScoped
public class DepartmentRepositoryImpl implements DepartmentRepository{
	
	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}
	
	@Override
	public Optional<Department> findById(Integer id) throws Exception {				
		return findById(id, Department.class);
	}

	@Override
	public List<Department> findAll() throws Exception {
		// create a Sentence
		String jpql = "SELECT department FROM Department department";		
		return findAll(Department.class, jpql);
	}

}
