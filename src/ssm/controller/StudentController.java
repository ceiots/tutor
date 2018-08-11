package ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ssm.entity.JsonToWeb;
import ssm.entity.Student;
import ssm.service.StudentService;
import javax.annotation.Resource;

import java.math.BigDecimal;
import java.util.List;

@Controller
public class StudentController {

	@Resource
	private StudentService studentService;

	private static Logger logger = Logger.getLogger(StudentController.class);
	// @CrossOrigin(origins = {"http://localhost:8100", "null"})
	@RequestMapping(value = "/getStudentListService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getStudentListService(/*@RequestParam("userId")String userId*/) {

		//System.out.println("testParam:"+userId); 
		//Student student = new Student(id, pic, name, university, college, profession, fraction);
		//studentService.addStudent(student);

		List<Student> studentList = studentService.findStudents();
		logger.debug("test"+studentList);
		
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", 200, true, studentList);
		System.out.println("jsonToWeb:" + jsonToWeb);
		return jsonToWeb;
	}
	/*
	 * public JsonToWeb getStudentListService(@RequestParam("id") String id,
	 * 
	 * @RequestParam("pic") String pic,
	 * 
	 * @RequestParam("name") String name,
	 * 
	 * @RequestParam("university") String university,
	 * 
	 * @RequestParam("college") String college,
	 * 
	 * @RequestParam("profession") String profession,
	 * 
	 * @RequestParam("grage") BigDecimal fraction) {
	 * 
	 * Student student = new
	 * Student(id,pic,name,university,college,profession,fraction);
	 * studentService.addStudent(student);
	 * 
	 * List<Student> studentList = studentService.findStudents(); JsonToWeb
	 * jsonToWeb = new JsonToWeb("Success","",200,true,studentList);
	 * System.out.println("jsonToWeb:"+jsonToWeb); return jsonToWeb; }
	 */

}
