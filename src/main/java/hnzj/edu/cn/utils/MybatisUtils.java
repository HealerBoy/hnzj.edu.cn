package hnzj.edu.cn.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

//获取sqlSession对象
public class MybatisUtils {
    private static Reader reader=null;
    private static final String config="mybatis-config.xml";
    public static SqlSession getSqlSession() {
        try {
            reader = Resources.getResourceAsReader(config);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        return sqlSessionFactory.openSession();
    }
    public static void destroy(){
        MybatisUtils.getSqlSession().close();
    }
}
