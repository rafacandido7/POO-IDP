package School;

public class Class {
    private final Teacher teacher;
    private final Subject subject;
    private final Student[] students;

    public Class(Teacher teacher, Subject subject, Student[] students) {
        this.teacher = teacher;
        this.subject = subject;
        this.students = students;
    }
}
