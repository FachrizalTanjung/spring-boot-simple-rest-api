package id.co.idstar.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.co.idstar.service.PeopleService;
import id.co.idstar.vo.Request;
import id.co.idstar.vo.Response;

@RestController
@RequestMapping("people")
public class PeopleRest {

	@Autowired
	private PeopleService peopleService;

	@PostMapping(value = "/find-by-id")
	public Response findById(@RequestBody Request request) {
		return peopleService.findPeopleById(Integer.valueOf(request.getId()));
	}

}
