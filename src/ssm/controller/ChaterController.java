package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import ssm.entity.Chater;
import ssm.entity.JsonToWeb;
import ssm.service.ChaterService;
import javax.annotation.Resource;
import java.util.List;

@Controller
public class ChaterController {

    @Resource
    private ChaterService chaterService;
   // private static final Logger log = Logger.getLogger(StudentController.class);// 日志文件
   // @CrossOrigin(origins = {"http://localhost:8100", "null"}) 
    @RequestMapping(value = "/getChaterService", method = RequestMethod.POST)
    @ResponseBody
    public JsonToWeb getChaterListService(/*@RequestParam("id") String id,
								    	   @RequestParam("pic") String pic,
								    	   @RequestParam("name") String name,
								    	   @RequestParam("lastWords") String lastWords*/ ) {
    	
    	/*Chater chater = new Chater(id,pic,name,lastWords);
    	chaterService.addChater(chater);*/
    	
        List<Chater> chaterList = chaterService.findChaters();
        JsonToWeb jsonToWeb = new JsonToWeb("success","",200,true,chaterList);
        System.out.println("jsonToWeb:"+jsonToWeb);
        return jsonToWeb;
    }
   
}