package hnzj.edu.cn.dao.impl;
import hnzj.edu.cn.dao.StudentDao;
import hnzj.edu.cn.entity.Student;
import hnzj.edu.cn.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;

public class StudentDaoImpl implements StudentDao {
    public static SqlSession sqlSession;
    StudentDao studentDao;
    @Override
    public int insertStudent(Student student) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        return studentDao.insertStudent(student);
    }
    @Override
    public int deleteById(int id) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        return studentDao.deleteById(id);
    }

    @Override
    public int updateStudent(Student student) {
        sqlSession= MybatisUtils.getSqlSession();
        studentDao=sqlSession.getMapper(StudentDao.class);
        return studentDao.updateStudent(student);
    }

    @Override
    public Student selectById(int id) {
        sqlSession = MybatisUtils.getSqlSession();
        studentDao = sqlSession.getMapper(StudentDao.class);
        return studentDao.selectById(id);
    }
}