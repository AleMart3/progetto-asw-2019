package asw.a_service.c.rest;

import org.springframework.web.bind.annotation.RestController;

import asw.a_service.c.domain.CService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
@RequestMapping(path="/a-service")
public class ServiceCController {

	@Autowired 
	private CService cService;

	@PostMapping
	public String saveRequest(@RequestBody String string) {
		return cService.saveRequest(string); 
		
	}
	
	@GetMapping
	public String getRequests() {
		return cService.getRequests();
	}
}


