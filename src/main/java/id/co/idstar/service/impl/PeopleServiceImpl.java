package id.co.idstar.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import id.co.idstar.dao.TbPeopleDao;
import id.co.idstar.model.TbPeople;
import id.co.idstar.service.PeopleService;
import id.co.idstar.vo.Response;

@Service
@Transactional(readOnly = true)
public class PeopleServiceImpl implements PeopleService {

	@Autowired
	private TbPeopleDao tbPeopleDao;

	@Override
	public Response findPeopleById(Integer id) {
		Optional<TbPeople> tbPeople = tbPeopleDao.findById(id);
		Response response = new Response();
		tbPeople.ifPresent(obj -> {
			response.setId(String.valueOf(obj.getId()));
			response.setName(obj.getName());
		});

		return response;
	}

}
