package com.qf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String upload(){
        return "upload";
    }


    @RequestMapping("/test_upload")
    public String test_upload(MultipartFile uploadFileName, Model model){
        File file=new File("G:\\JAVA\\a\\tomcat\\apache-tomcat-8.5.43-windows-x64 -file\\apache-tomcat-8.5.43\\webapps\\images\\");
        String fileName=uploadFileName.getOriginalFilename();
//        fileName= UUID.randomUUID().toString()+fileName;
        model.addAttribute("fileName",fileName);
        try {
            uploadFileName.transferTo(new File(file,fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "show";
    }

}
