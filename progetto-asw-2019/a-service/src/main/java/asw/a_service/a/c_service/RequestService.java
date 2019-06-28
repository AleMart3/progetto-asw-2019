package asw.a_service.a.c_service;

import org.springframework.stereotype.Service;

import asw.a_service.a.domain.CService;

import org.springframework.beans.factory.annotation.Autowired;

@Service 
public class RequestService implements CService {
	
	@Autowired
	private RequestClient requestClient;
	
	@Override
	public String saveRequest(String request) {
		return requestClient.saveRequest(request); 
	}

	@Override
	public String getRequests() {
		return requestClient.getRequests();
	}

	
	
}
