package pe.edu.upc.trabajo.models.repository.impl;

import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import pe.edu.upc.trabajo.models.entities.Post;
import pe.edu.upc.trabajo.models.repository.PostRepository;

@Named
@ApplicationScoped
public class PostRepositoryImpl implements PostRepository {

	@PersistenceContext(unitName = "trabajoPU")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	@Override
	public Optional<Post> findById(Integer id) throws Exception {
		return findById(id, Post.class);
	}

	@Override
	public List<Post> findAll() throws Exception {
		// TODO Auto-generated method stub
		String jpql = "SELECT post FROM Post post";		
		return findAll(Post.class, jpql);
	}

}
