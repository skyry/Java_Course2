package generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar s1 = new Schoolar("Ivan", 13);
        Schoolar s2 = new Schoolar("Mariya", 15);

        Student st1 = new Student("Mikola", 20);
        Student st2 = new Student("Ksuha", 18);

        Employee e1 = new Employee("Petro", 32);
        Employee e2 = new Employee("Nazar", 47);

        Team t1 = new Team("School");
        t1.addNewParticipants(s1);
        t1.addNewParticipants(s2);

    }

}
