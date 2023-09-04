package School;
import java.util.UUID;
public class Teacher extends Person {
    private final UUID teacherId;
    private Subject subject;

    public Teacher(String name, Subject subject) {
        super(name);
        this.teacherId = UUID.randomUUID();

        this.subject = setSubject(subject);
    }

    public Subject getSubject() {
        return this.subject;
    }

    public Subject setSubject(Subject subject) {
        this.subject = subject;
        subject.setTeacher(this);
        return this.subject;
    }

    public UUID getTeacherId() {
        return teacherId;
    }
}
