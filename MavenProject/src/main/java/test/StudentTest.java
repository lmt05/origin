package test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import pojo.Student;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTest {
    public static void main(String[] args) {
   /*     //  按ID查询书名
        String resource="mybatis-config.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
            SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
            SqlSession session=sqlMapper.openSession();
            List<Student> list=session.selectList("findAll");
            for (Student s:list) {
                System.out.println(s.toString());
            }
            session.close();
        }catch (Exception e1) {
            e1.printStackTrace();
            throw new ExceptionInInitializerError("��ʼ��MyBatis�������������ļ������ݿ�");
        }*/

        //  按ID查询书名
        String resource="mybatis-config.xml";
        Reader reader=null;
        try {
            reader= Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
        SqlSession session=sqlMapper.openSession();
        List<Student> list=session.selectList("findAll");
        for (Student s:list) {
            System.out.println(s.toString());
        }

        Map<String,Object> map = new HashMap<>();
    }
}
