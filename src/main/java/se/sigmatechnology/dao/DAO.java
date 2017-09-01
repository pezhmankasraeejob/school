package se.sigmatechnology.dao;

import org.springframework.stereotype.Repository;
import se.sigmatechnology.entity.Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;

/**
 * Created by pke on 2017-09-01.
 */
@Repository
public class DAO {

    private ArrayList<Student> students;

    public DAO() {
        students.add(new Student("12345", "Pezhmann Kasraee", "Software Engineering"));
        students.add(new Student("898989", "Ronald Jackson", "Mathematics and Physics"));
        students.add(new Student("2876928", "Roy Hamilton", "Fine Arts"));
    }

    public Collection<Student> getAllStudents(){
        return this.students;
    }

}
