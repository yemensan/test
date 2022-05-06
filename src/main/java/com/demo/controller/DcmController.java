package com.demo.controller;

import com.demo.util.DcmUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class DcmController {

    @RequestMapping("/dcm2Jpg")
    public String dcm2Jpg(String dicomFilePath,String imgFilePath) {
        boolean flag= DcmUtil.dcm2Img(dicomFilePath,imgFilePath);
        return flag?imgFilePath:"";
    }


}
