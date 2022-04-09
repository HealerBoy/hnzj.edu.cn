package hnzj.edu.cn.dao.impl;

import hnzj.edu.cn.dao.StudentDao;
import hnzj.edu.cn.entity.Student;
import hnzj.edu.cn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository("studentDao")
public class StudentDaoImpl implements StudentDao {
    private SqlSession sqlSession;
    private StudentDao studentDao;
    @Override
    public int insertStudent(Student student) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        int result=studentDao.insertStudent(student);
        if(result > 0){
            System.out.println("数据插入成功");
        }else{
            System.out.println("数据插入失败");
        }
        return result;
    }

    @Override
    public int deleteById(int id) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        int result=studentDao.deleteById(id);
        if(result > 0){
            System.out.println("数据删除成功");
        }else{
            System.out.println("数据删除失败");
        }
        return result;
    }

    @Override
    public int updateStudent(Student student) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        int result=studentDao.updateStudent(student);
        if(result > 0){
            System.out.println("数据修改成功");
        }else{
            System.out.println("数据修改失败");
        }
        return result;
    }

    @Override
    public Student selectById(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
        return studentDao.selectById(id);
    }
}