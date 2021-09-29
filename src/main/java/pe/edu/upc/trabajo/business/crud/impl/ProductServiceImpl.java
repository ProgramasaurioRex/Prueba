package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.ProductService;
import pe.edu.upc.trabajo.models.entities.Product;
import pe.edu.upc.trabajo.models.repository.JpaRepository;
import pe.edu.upc.trabajo.models.repository.ProductRepository;

@Named
@ApplicationScoped
public class ProductServiceImpl implements ProductService {

	@Inject
	private ProductRepository productRepository;
	
	@Override
	public JpaRepository<Product, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return productRepository;
	}

}
