package ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import common.Constant;
import ssm.entity.Upload;
import ssm.service.UploadService;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/upload")
public class UploadController {

    @Resource
    private UploadService uploadService;
    
    @RequestMapping(value = "/uploadPhoto", method = RequestMethod.POST)
    @ResponseBody
    public void  uploadPhoto(@RequestParam(value="userId", required=true)String userId,
    		@RequestParam(value="photo1", required=true)CommonsMultipartFile photo1,HttpServletRequest request) {
       
    	/*MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartRequest.getFile("photo1");
    	String fileName = file.getOriginalFilename();
    	try {
    		File savePath = new File(Constant.UPLOAD_FOLDER_ROOT + "/" + Constant.UPLOAD_FOLDER_IMG);
    		if(!savePath.exists()){
    			savePath.mkdir();
    		}
    		System.out.println("fileName=" + savePath + "\\" +fileName); 
    		OutputStream outputStream = new FileOutputStream(savePath+"\\"+fileName);
    		
    		InputStream inputStream = file.getInputStream();
			 byte[] buffer = new byte[1024];
			 while((inputStream.read(buffer))>0){
				 outputStream.write(buffer);
			 }
			 inputStream.close();
			 outputStream.close();
    	
    	} catch (IOException e) {
			e.printStackTrace();
		}*/
    	
    	 byte[] photo1Byte = photo1.getBytes();
         uploadService.uploadPhoto(userId,photo1Byte);
    	// Map<String,List<Upload>> map = new HashMap<String,List<Upload>>();
    	// map.put("upload",uploadService.findUpload()); 
        
    }
   
    @RequestMapping(value = "/uploadVideo", method = RequestMethod.POST)
    @ResponseBody
    public void uploadVideo(@RequestParam(value="userId", required=true)String userId,
    		@RequestParam(value="video1", required=true)CommonsMultipartFile video1,HttpServletRequest request) {
    	
    	/*//Upload file to Server
    	MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest)request;
        MultipartFile file = multipartRequest.getFile("video1");
     	String fileName = file.getOriginalFilename();
     	try {
     		File savePath = new File(Constant.UPLOAD_FOLDER_ROOT + "/" + Constant.UPLOAD_FOLDER_VIDEO);
     		if(!savePath.exists()){
     			savePath.mkdir();
     		}
     		System.out.println("fileName=" + savePath + "\\" +fileName); 
     		OutputStream outputStream = new FileOutputStream(savePath+"\\"+fileName);
     		
     		InputStream inputStream = file.getInputStream();
 			 byte[] buffer = new byte[1024];
 			 while((inputStream.read(buffer))>0){
 				 outputStream.write(buffer);
 			 }
 			 inputStream.close();
 			 outputStream.close();
     	
     	} catch (IOException e) {
 			e.printStackTrace();
 		}*/
     	
     	 //Sava to DB
     	 byte[] video1Byte = video1.getBytes();
    	 uploadService.uploadVideo(userId, video1Byte);
    	
         
    }
}
