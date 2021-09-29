package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.OrderService;
import pe.edu.upc.trabajo.models.entities.Order;
import pe.edu.upc.trabajo.models.repository.JpaRepository;
import pe.edu.upc.trabajo.models.repository.OrderRepository;

@Named
@ApplicationScoped
public class OrderServiceImpl implements OrderService {

	@Inject
	private OrderRepository orderRepository;
	
	@Override
	public JpaRepository<Order, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return orderRepository;
	}

}
