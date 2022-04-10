package hnzj.edu.cn.service.impl;

import hnzj.edu.cn.dao.MajorDao;
import hnzj.edu.cn.entity.Major;
import hnzj.edu.cn.service.MajorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("majorService")
public class MajorServiceImpl implements MajorService {
    @Resource(name = "majorDao")
    MajorDao majorDao;
    @Override
    public int insertMajor(Major major) {
        return this.majorDao.insertMajor(major);
    }

    @Override
    public int deleteMajor(int id) {
        return this.majorDao.deleteMajor(id);
    }

    @Override
    public int updateMajor(int id) {
        return this.majorDao.updateMajor(id);
    }

    @Override
    public Major selectMajor(int id) {
        return this.majorDao.selectMajor(id);
    }
}
