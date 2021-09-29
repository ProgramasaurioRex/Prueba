package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.User;
import pe.edu.upc.trabajo.models.repository.UserRepository;

@Named
@ApplicationScoped
public class UserRepositoryImpl implements UserRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<User> findById(Integer id) throws Exception {
		return findById(id, User.class);
	}

	@Override
	public List<User> findAll() throws Exception {
		// create a Sentence
		String jpql = "SELECT user FROM User user";		
		return findAll(User.class, jpql);
	}

}
