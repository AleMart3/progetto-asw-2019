package asw.a_service.a.c_service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("c-service")
@RibbonClient(name="c-service")
public interface RequestClient {

	@RequestMapping(value="/a-service", method=RequestMethod.POST)
	public String saveRequest(@RequestBody String request);

	@RequestMapping(value="/a-service", method=RequestMethod.GET)
	public String getRequests();

}
