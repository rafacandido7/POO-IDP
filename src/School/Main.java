package School;

public class Main {

    public static void main(String[] args) {
        // Subjects
        Subject Poo = new Subject("Poo");
        Subject Ed = new Subject("Ed");
        Subject Bi = new Subject("Bi");

        // Teachers
        Teacher Mia = new Teacher("Mia", Poo);
        Teacher Saulo = new Teacher("Saulo", Ed);
        Teacher Paula = new Teacher("Paula", Bi);

        // Courses
        Course Adm = new Course("ADM", new Subject[]{Bi});
        Course Ti = new Course("Ti", new Subject[]{Ed, Poo});

        Course[] courses = {Adm, Ti};

        Ensalamento ens = new Ensalamento();

        String[] students = {"Alfredo", "Peterson", "Wendel", "Ian", "Debra", "Luana", "Bruno", "Romeu", "Julieta", "Maria", "Capitú", "Bentinho", "Amélia"};

        ens.setEnsalamento(students, courses);
        ens.showEnsalamento();

    }
}
