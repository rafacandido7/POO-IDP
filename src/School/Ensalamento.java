package School;

public class Ensalamento {
    private Student[] students;

    public Student[] getStudents() {
        return this.students;
    }

    private Student[] setStudents(String[] students, Course[] courses) {
        Student[] newStudentsClass = new Student[students.length];

        for(int i = 1; i < students.length; i++) {
            if (i % 2 == 0) {
                newStudentsClass[i] = new Student(students[i], courses[i % courses.length]);
            } else {
                newStudentsClass[i] = new Student(students[i], courses[i % courses.length]);
            }
        }
        this.students = newStudentsClass;
        return newStudentsClass;
    }

    private String getSubjectsNames(Subject[] subjects) {
        StringBuilder subjectNames = new StringBuilder();

        for (int i = 0; i < subjects.length; i++) {
            Subject subject = subjects[i];

            if (subject.getTeacher() != null) {
                String subjectName = subject.getName();
                String teacherName = subject.getTeacherName();

                if (!subjectNames.isEmpty()) {
                    subjectNames.append(", ");
                }

                subjectNames.append(subjectName).append(" - Prof ").append(teacherName);
            }
        }

        return subjectNames.toString();
    }
    public void showEnsalamento() {
        Student[] _students = this.getStudents();

        for(int i = 1; i < _students.length; i++) {
            String studentName = _students[i].getName();
            Course studentCourse = _students[i].getCourse();
            Subject[] studentSubjects = studentCourse.getSubjects();

            System.out.println("-------------------------");
            System.out.println("Nome: " + studentName);
            System.out.println("Curso: " + studentCourse.getCourseName());
            System.out.println("Materias: " + getSubjectsNames(studentSubjects));


            students[i].getCourse().getSubjects();
            System.out.println("-------------------------\n");
        }
    }

    public void setEnsalamento(String[] students, Course[] courses) {
        this.setStudents(students, courses);
    }
}
