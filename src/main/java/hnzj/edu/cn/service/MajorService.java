package hnzj.edu.cn.service;

import hnzj.edu.cn.entity.Major;

public interface MajorService {
    int insertMajor(Major major);
    int deleteMajor(int id);
    int updateMajor(int id);
    Major selectMajor(int id);
}
