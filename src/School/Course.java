package School;

import java.util.UUID;

public class Course {
    private final UUID id;
    private final String name;
    private Subject[] subjects;
    private Teacher teacher;

    public Course(String name, Subject[] subjects) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.subjects = subjects;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Subject[] setSubjects(Subject[] subjects) {
        this.subjects = subjects;
        return subjects;
    }

    public Subject[] getSubjects() {
        return this.subjects;
    }

    public String getCourseName() {
        return this.name;
    }
}
