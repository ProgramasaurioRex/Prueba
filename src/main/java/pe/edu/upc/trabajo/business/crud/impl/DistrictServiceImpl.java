package pe.edu.upc.trabajo.business.crud.impl;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.trabajo.business.crud.DistrictService;
import pe.edu.upc.trabajo.models.entities.District;
import pe.edu.upc.trabajo.models.repository.DistrictRepository;
import pe.edu.upc.trabajo.models.repository.JpaRepository;

@Named
@ApplicationScoped
public class DistrictServiceImpl implements DistrictService {

	@Inject
	private DistrictRepository districtRepository;
	
	@Override
	public JpaRepository<District, Integer> getJpaRepository() {
		// TODO Auto-generated method stub
		return districtRepository;
	}

}
