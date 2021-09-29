package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.repository.OrderDetailRepository;

@Named
@ApplicationScoped
public class OrderDetailRepositoryImpl implements OrderDetailRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<OrderDetail> findById(Integer id) throws Exception {
		return findById(id, OrderDetail.class);
	}

	@Override
	public List<OrderDetail> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT department FROM Department department";		
		return findAll(OrderDetail.class, jpql);
	}

}
