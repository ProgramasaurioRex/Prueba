package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.repository.FormPaymentRepository;

@Named
@ApplicationScoped
public class FormPaymentImpl implements FormPaymentRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<FormPaymentRepository> findById(Integer id) throws Exception {
		return findById(id, FormPaymentRepository.class);
	}

	@Override
	public List<FormPaymentRepository> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT formPayment FROM FormPayment formPayment";		
		return findAll(FormPaymentRepository.class, jpql);
	}

}
