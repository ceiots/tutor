package ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.entity.JsonToWeb;
import ssm.entity.Student;
import ssm.service.StudentService;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;

	private static Logger logger = Logger.getLogger(StudentController.class);
	// @CrossOrigin(origins = {"http://localhost:8100", "null"})
	@RequestMapping(value = "/getStudentListService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getStudentListService(HttpServletResponse response/*@RequestParam("userId")String userId*/) {
		//System.out.println("testParam:"+userId); 
		//Student student = new Student(id, pic, name, university, college, profession, totalFraction,Chinese,Maths,English,Comprehensives);
		//studentService.addStudent(student);

		List<Student> studentList = studentService.findStudents();
		logger.debug("test"+studentList);
		String result = "success";
		if(200!=response.getStatus()){
			result = "false";
		}
		JsonToWeb jsonToWeb = new JsonToWeb(result, "", response.getStatus(), true, studentList.toString());
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}

	
	@RequestMapping(value = "/getStudentListServiceTest", method = RequestMethod.GET)
	@ResponseBody
	public JsonToWeb getStudentListServiceTest(HttpServletResponse response) {
		System.out.println("status"+response.getStatus());

		List<Student> studentList = studentService.findStudents();
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", response.getStatus(), true, studentList.toString());
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}
	
}
