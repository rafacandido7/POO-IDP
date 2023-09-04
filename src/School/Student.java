package School;
import java.util.UUID;
public class Student extends Person {
    private final UUID studentId;
    private final Course course;

    public Student (String name, Course course) {
        super(name);
        this.studentId = UUID.randomUUID();
        this.course = course;
    }

    public Course getCourse() {
        return course;
    }

    public UUID getStudentId() {
        return studentId;
    }

}
