package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.UserService;
import pe.edu.upc.trabajo.models.entities.User;
import pe.edu.upc.trabajo.models.repository.JpaRepository;
import pe.edu.upc.trabajo.models.repository.UserRepository;

@Named
@ApplicationScoped
public class UserServiceImpl implements UserService {

	@Inject
	private UserRepository userRepository;
	
	@Override
	public JpaRepository<User, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return userRepository;
	}

}
