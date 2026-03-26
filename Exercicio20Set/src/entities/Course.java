package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {

    private String name;
    private Set<Student> students = new HashSet<Student>();

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void addStudentToCourse(Student student) {
        this.students.add(student);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name) && Objects.equals(students, course.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, students);
    }
}
