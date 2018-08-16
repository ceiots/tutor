package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ssm.entity.Chater;
import ssm.entity.JsonToWeb;
import ssm.service.ChaterService;
import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

@Controller
public class ChaterController {

    @Resource
    private ChaterService chaterService;
   // private static final Logger log = Logger.getLogger(StudentController.class);// 日志文件
   // @CrossOrigin(origins = {"http://localhost:8100", "null"}) 
    @RequestMapping(value = "/getChaterService", method = RequestMethod.POST)
    @ResponseBody
    public JsonToWeb getChaterListService(HttpServletResponse response/*@RequestParam("id") String id,
								    	   @RequestParam("pic") String pic,
								    	   @RequestParam("name") String name,
								    	   @RequestParam("lastWords") String lastWords*/ ) {
    	
    	/*Chater chater = new Chater(id,pic,name,lastWords);
    	chaterService.addChater(chater);*/
        List<Chater> chaterList = chaterService.findChaters();
    	String result = "success";
		if(200!=response.getStatus()){
			result = "false";
		}
        JsonToWeb jsonToWeb = new JsonToWeb(result,"",response.getStatus(),true,chaterList);
        System.out.println("jsonToWeb:"+jsonToWeb);
        return jsonToWeb;
    }
   
}
