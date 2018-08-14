package ssm.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ssm.entity.Grades;
import ssm.entity.JsonToWeb;
import ssm.service.GradesService;

@Controller
public class GradesController {

	@Resource
	private GradesService gradesService;

	@RequestMapping(value = "/getGradesService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getGradesService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {
		List<Grades> gradesList = gradesService.findGrades();
		
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", response.getStatus(), true, gradesList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

}
