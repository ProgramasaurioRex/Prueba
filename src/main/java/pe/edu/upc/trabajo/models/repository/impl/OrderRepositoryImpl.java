package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.Order;
import pe.edu.upc.trabajo.models.repository.OrderRepository;

@Named
@ApplicationScoped
public class OrderRepositoryImpl implements OrderRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<Order> findById(Integer id) throws Exception {
		return findById(id, Order.class);
	}

	@Override
	public List<Order> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT order FROM Order order";		
		return findAll(Order.class, jpql);
	}

}
