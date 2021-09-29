package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.CategoryService;
import pe.edu.upc.trabajo.models.entities.Category;
import pe.edu.upc.trabajo.models.repository.CategoryRepository;
import pe.edu.upc.trabajo.models.repository.JpaRepository;

@Named
@ApplicationScoped
public class CategoryServiceImpl implements CategoryService{
	
	@Inject
	private CategoryRepository categoryRepository;
	
	@Override
	public JpaRepository<Category, Integer> getJpaRepository() {
		return categoryRepository;
	}
}
