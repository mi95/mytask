package com.app.controller;

import com.common.pojo.RespBean;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@RestController
@RequestMapping("common")
public class CommonController {

    @PostMapping("uploadImg")
    public RespBean uploadImg(MultipartFile file) {
        if (file.isEmpty()) {
            return RespBean.fail("上传失败，请选择文件");
        }
        String url = "C:\\Users\\xiami\\Desktop\\test\\";
        String fileName = file.getOriginalFilename();
        String fileType=fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID().toString()+fileType;
        String filePath = url+fileName;
        File dest = new File(filePath);
        try {
            file.transferTo(dest);
            return RespBean.success(filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return RespBean.fail("上传失败");
    }


}
