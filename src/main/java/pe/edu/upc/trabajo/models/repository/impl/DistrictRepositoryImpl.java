package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.District;
import pe.edu.upc.trabajo.models.repository.DistrictRepository;

@Named
@ApplicationScoped
public class DistrictRepositoryImpl implements DistrictRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<District> findById(Integer id) throws Exception {
		return findById(id, District.class);
	}

	@Override
	public List<District> findAll() throws Exception {
		String jpql = "SELECT district FROM District district";		
		return findAll(District.class, jpql);
	}

}
