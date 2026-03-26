import entities.Course;
import entities.Instructor;
import entities.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Scanner sc = new Scanner(System.in);

    //Adicionando instrutor
    Instructor instructorAlex = new Instructor(1,"Alex");
    //Adicionando Cursos
    Course courseA = new Course("A");
    Course courseB = new Course("B");
    Course courseC = new Course("C");
    //Adicionando Alunos
    Student s1 = new Student(21);
    Student s2 = new Student(35);
    Student s3 = new Student(22);
    Student s4 = new Student(50);
    Student s5 = new Student(42);
    Student s6 = new Student(13);

    //Adicionando Instrutor -> Curso
    instructorAlex.addCourseToInstructor(courseA);
    instructorAlex.addCourseToInstructor(courseB);
    instructorAlex.addCourseToInstructor(courseC);

    //Registro Aluno -> CursoA
    courseA.addStudentToCourse(s1);
    courseA.addStudentToCourse(s2);
    courseA.addStudentToCourse(s3);
    //Registro Aluno -> CursoB
    courseB.addStudentToCourse(s1);
    courseB.addStudentToCourse(s4);
    //Registro Aluno -> CursoC
    courseC.addStudentToCourse(s5);
    courseC.addStudentToCourse(s2);
    courseC.addStudentToCourse(s6);



    for (Course course : instructorAlex.getCourses()){
        IO.println("How many students for course " + course.getName() + "? " + course.getStudents().size());
        for (Student student : course.getStudents()) {
            System.out.println(student.getId());
        }
    }

    IO.println("Total students: "+ allStudents(courseA, courseB, courseC) );


}

public static int allStudents(Course... courses){
    Set<Student> allStudents = new HashSet<>();
    for (Course course : courses){
        course.getStudents().forEach(student -> allStudents.add(student));
    }
    return allStudents.size();
}
