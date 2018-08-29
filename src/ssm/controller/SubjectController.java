package ssm.controller;

import java.util.List;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.entity.Subject;
import ssm.pojo.JsonToWeb;
import ssm.service.SubjectService;

@Controller
public class SubjectController {

	@Resource
	private SubjectService subjectService;

	@RequestMapping(value = "/getSubjectService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getStudentListService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {

		List<Subject> subjectList = subjectService.findSubjects();
		String result = "success";
		if(200!=response.getStatus()){
			result = "false";
		}
		JsonToWeb jsonToWeb = new JsonToWeb(result, "", response.getStatus(), true, subjectList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

}
