package hnzj.edu.cn.controller;

import hnzj.edu.cn.entity.Major;
import hnzj.edu.cn.service.MajorService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class MajorController {
    @Resource(name = "majorService")
    MajorService majorService;
    public int insertMajor(Major major){
        return this.majorService.insertMajor(major);
    }
    public int deleteMajor(int id){
        return this.majorService.deleteMajor(id);
    }
    public int updateMajor(int id){
        return this.majorService.updateMajor(id);
    }
    public Major selectMajor(int id){
        return this.majorService.selectMajor(id);
    }
}
