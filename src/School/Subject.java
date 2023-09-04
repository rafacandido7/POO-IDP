package School;

import java.util.UUID;

public class Subject {
    private final UUID id;
    private final String name;

    private Teacher teacher;

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getTeacherName() {
        return this.teacher.getName();
    }

    public Teacher getTeacher() {
        return this.teacher;
    }


    public String getName() {
        return this.name;
    }

    public Subject(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }
}
