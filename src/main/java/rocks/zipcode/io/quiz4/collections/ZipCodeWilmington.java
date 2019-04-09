package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private Student student;
    private double numberOfHours = 0.0;



    List<Student> students = new ArrayList<Student>();

    public void enroll(Student student) {

        students.add(student);
    }

    public Boolean isEnrolled(Student student) {

        return students.contains(student);
    }

    public void lecture(double numberOfHours) {

        for(Student student: students) {
            student.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {

        Map<Student, Double> studyMap = new LinkedHashMap<>();
        for(Student student:students) {
            studyMap.put(student, student.totalStudyTime);
        }
        return studyMap;
    }
}
