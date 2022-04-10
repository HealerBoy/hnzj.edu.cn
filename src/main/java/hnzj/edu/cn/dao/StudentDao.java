package hnzj.edu.cn.dao;
import hnzj.edu.cn.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StudentDao {
    @Insert("insert into student"+" values(#{id},#{name},#{age},#{sex},#{idCard},#{phone},#{studentNumber},#{gradeId},#{academyId},#{majorId},#{classesId})")
    int insertStudent(Student student);
    @Delete("delete from student where id = #{id}")
    int deleteById(int id);
    //@Update("update student set name=#{name}")
    int updateStudent(Student student);
    @Select("select * from student where id = #{id}")
    Student selectById(int id);
}
