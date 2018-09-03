package dao;
 
import pojo.Student;

import java.util.List;

public interface studentDao {
    public List<Student> findAll();
}
