package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.OrderDetailService;
import pe.edu.upc.trabajo.models.entities.OrderDetail;
import pe.edu.upc.trabajo.models.repository.JpaRepository;
import pe.edu.upc.trabajo.models.repository.OrderDetailRepository;

@Named
@ApplicationScoped
public class OrderDetailServiceImpl implements OrderDetailService {

	@Inject
	private OrderDetailRepository orderDetailRepository;
	
	@Override
	public JpaRepository<OrderDetail, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return orderDetailRepository;
	}

}
