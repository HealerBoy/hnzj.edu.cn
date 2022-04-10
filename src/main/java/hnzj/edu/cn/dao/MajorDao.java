package hnzj.edu.cn.dao;

import hnzj.edu.cn.entity.Major;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface MajorDao {
    @Insert("insert into major"+" values(#{id},#{major},#{academyId})")
    int insertMajor(Major major);
    @Delete("delete from major where id=#{id}")
    int deleteMajor(int id);
    /*
    @Update("")
     */
    int updateMajor(int id);
    @Select("select * from major")
    Major selectMajor(int id);
}
