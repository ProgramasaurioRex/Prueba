package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.FormPaymentService;
import pe.edu.upc.trabajo.models.repository.FormPaymentRepository;
import pe.edu.upc.trabajo.models.repository.JpaRepository;

@Named
@ApplicationScoped
public class FormPaymentServiceImpl implements FormPaymentService {

	@Inject
	private FormPaymentRepository formPaymentRepository;
	
	@Override
	public JpaRepository<FormPaymentRepository, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return formPaymentRepository;
	}

}
