package asw.a_service.a.rest;

import org.springframework.web.bind.annotation.RestController;

import asw.a_service.a.domain.AService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping(path="/a-service")
public class AServiceController {

	@Autowired 
	private AService aService;
	

	@PostMapping
	public String saveRequest() {
		return aService.saveRequest();
		
	}
	
	@GetMapping
	public String getRequests() {
		 return aService.getRequests();
		
	}
	
}
