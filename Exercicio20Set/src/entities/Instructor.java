package entities;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Instructor {

    private Integer id;
    private String name;
    private Set<Course> courses =  new HashSet<Course>();

    public Instructor(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Course> getCourses() {
        return courses;
    }

    public void addCourseToInstructor(Course course) {
        this.courses.add(course);
    }
}
