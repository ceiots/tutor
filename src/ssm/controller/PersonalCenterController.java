package ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.entity.JsonToWeb;
import ssm.entity.PersonalCenter;
import ssm.service.PersonalCenterService;

@Controller
public class PersonalCenterController {

	@Resource
	private PersonalCenterService personalCenterService;

	@RequestMapping(value = "/getPersonalCenterService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getPersonalCenterService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {

		List<PersonalCenter> personalCenterList = personalCenterService.findPersonalCenters();
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", response.getStatus(), true, personalCenterList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

}
