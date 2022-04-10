package hnzj.edu.cn.dao.impl;

import hnzj.edu.cn.dao.MajorDao;
import hnzj.edu.cn.entity.Major;
import hnzj.edu.cn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("majorDao")
public class MajorImpl implements MajorDao {
    SqlSession sqlSession;
    MajorDao majorDao;
    @Override
    public int insertMajor(Major major) {
        sqlSession = MybatisUtils.getSqlSession();
        majorDao = sqlSession.getMapper(MajorDao.class);
        int result = majorDao.insertMajor(major);
        if(result > 0){
            System.out.println("数据插入成功");
        }else{
            System.out.println("数据插入失败");
        }
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public int deleteMajor(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        majorDao = sqlSession.getMapper(MajorDao.class);
        int result = majorDao.deleteMajor(id);
        if(result > 0){
            System.out.println("数据删除成功");
        }else{
            System.out.println("数据删除失败");
        }
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public int updateMajor(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        majorDao = sqlSession.getMapper(MajorDao.class);
        int result = majorDao.updateMajor(id);
        if(result > 0){
            System.out.println("数据修改成功");
        }else{
            System.out.println("数据修改失败");
        }
        sqlSession.commit();
        sqlSession.close();
        return result;
    }

    @Override
    public Major selectMajor(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        majorDao = sqlSession.getMapper(MajorDao.class);
        return majorDao.selectMajor(id);
    }
}
