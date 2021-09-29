package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.Category;
import pe.edu.upc.trabajo.models.repository.CategoryRepository;

@Named
@ApplicationScoped
public class CategoryRepositoryImpl implements CategoryRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<Category> findById(Integer id) throws Exception {
		return findById(id, Category.class);
	}

	@Override
	public List<Category> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT category FROM Category category";		
		return findAll(Category.class, jpql);
	}

}
