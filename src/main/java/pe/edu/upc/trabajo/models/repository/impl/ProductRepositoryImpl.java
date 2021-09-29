package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.repository.ProductRepository;

@Named
@ApplicationScoped
public class ProductRepositoryImpl implements ProductRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<Product> findById(Integer id) throws Exception {
		return findById(id, Product.class);
	}

	@Override
	public List<Product> findAll() throws Exception {
		String jpql = "SELECT product FROM Product product";		
		return findAll(Product.class, jpql);
	}

}
