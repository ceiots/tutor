package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ssm.entity.ChatRecord;
import ssm.entity.JsonToWeb;
import ssm.entity.Student;
import ssm.service.ChatRecordService;
import ssm.service.StudentService;
import javax.annotation.Resource;

import java.util.List;

@Controller
public class ChatRecordController {

	@Resource
	private ChatRecordService chatRecordService;

	// private static final Logger log =
	// Logger.getLogger(StudentController.class);// 日志文件
	// @CrossOrigin(origins = {"http://localhost:8100", "null"})
	@RequestMapping(value = "/getChatRecordService", method = RequestMethod.POST)
	@ResponseBody
	public JsonToWeb getChatRecordService(@RequestParam("userId")Object userId) {

		System.out.println("testParam:"+userId.toString());
		//Student student = new Student(id, pic, name, university, college, profession, fraction);
		//studentService.addStudent(student);

		List<ChatRecord> chatRecordList = chatRecordService.findChatRecords();
		
		
		JsonToWeb jsonToWeb = new JsonToWeb("success", "", 200, true, chatRecordList);
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
