package com.mr.clj.easypoi.controller;

import com.mr.clj.easypoi.entity.EasyPoiEntity;
import com.mr.clj.easypoi.service.EasyPoiService;
import com.mr.clj.easypoi.utils.ExcelUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName EasyPoiController
 * @Description: TODO
 * @Author 9
 * @Date 2020/1/6
 * @Version V1.0
 **/
@RestController
@RequestMapping(value = "demo")
public class EasyPoiController {


    @Autowired
    private EasyPoiService service;

    @GetMapping
    @Scheduled(cron = "")
    public void export(HttpServletResponse response){

        List<EasyPoiEntity> list = service.list();
        try {
            ExcelUtils.exportExcel(list,"表格大标题","sheet1",EasyPoiEntity.class,"ceshi",response);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping
    public String impExcel(@RequestBody @RequestParam("file") MultipartFile file){

        try {

            String fileName = file.getOriginalFilename();
            String subName = fileName.substring(fileName.lastIndexOf("."));
            if(subName.equalsIgnoreCase(".xls") || subName.equalsIgnoreCase(".xlsx")){
                List<EasyPoiEntity> easyPoiEntities = ExcelUtils.importExcel(file, EasyPoiEntity.class);
                service.save(easyPoiEntities);
            }else {
             return "文件格式错误";
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "导入成功";
    }
}