package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.PostService;
import pe.edu.upc.trabajo.models.entities.Post;
import pe.edu.upc.trabajo.models.repository.JpaRepository;
import pe.edu.upc.trabajo.models.repository.PostRepository;

@Named
@ApplicationScoped

public class PostServiceImpl implements PostService {

	@Inject
	private PostRepository postRepository;
	
	@Override
	public JpaRepository<Post, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return postRepository;
	}

}
