package ssm.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import ssm.entity.Partner;
import ssm.pojo.JsonToWeb;
import ssm.service.PartnerService;

@Controller
public class PartnerController {

    @Resource
    private PartnerService partnerService;
   // private static final Logger log = Logger.getLogger(StudentController.class);// 日志文件
   // @CrossOrigin(origins = {"http://localhost:8100", "null"}) 
    @RequestMapping(value = "/getPartnerService", method = RequestMethod.POST)
    @ResponseBody
    public JsonToWeb getStudentListService(HttpServletResponse response,
    										@RequestParam("id") String id,
								    		@RequestParam("pic") String pic,
								    		@RequestParam("author") String author,
								    		@RequestParam("name") String name,
								    		@RequestParam("votes") Integer votes) {
    	
    	Partner partner = new Partner(id,pic,author,name,votes);
    	System.out.println(partner.toString());
    	partnerService.addPartner(partner);
    	
        List<Partner> partnerList = partnerService.findPartners();
    	String result = "success";
		if(200!=response.getStatus()){
			result = "false";
		}
        JsonToWeb jsonToWeb = new JsonToWeb(result,"",response.getStatus(),true,partnerList);
        System.out.println("jsonToWeb:"+jsonToWeb);
        return jsonToWeb;
    }
   
}