package asw.a_service.a.domain;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service 
public class AService{
	
	
	@Value("${spring.profiles}")
	private String profile;

	@Value("${animals}") 
	private String animals;

	@Autowired 
	private CService cService;

	private String request;

	
	
	public String saveRequest() {
		return cService.saveRequest(this.createRequest());
	}
	
	public String getRequests() {
		return cService.getRequests();
	}
	
	
	public String createRequest() {
		this.request="";
		String[] animalsArray = animals.split(",");
		int i = (int) (Math.round(Math.random()*(animalsArray.length-1)));
		String animal = animalsArray[i];
		this.request=profile + ":" + animal;
		
		
		return this.request;
	}
}
