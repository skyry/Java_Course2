package generics.Game;

public class Test {
    public static void main(String[] args) {
        Schoolar sc1 = new Schoolar("Ivan", 13);
        Schoolar sc2 = new Schoolar("Mariya", 15);

        Schoolar sc3 = new Schoolar("Igor", 14);
        Schoolar sc4 = new Schoolar("Edik", 13);

//        Student st1 = new Student("Mikola", 20);
//        Student st2 = new Student("Ksuha", 18);
//
//        Employee emp1 = new Employee("Petro", 32);
//        Employee emp2 = new Employee("Nazar", 47);

        Team<Schoolar> ts1 = new Team<Schoolar>("School1");
        ts1.addNewParticipants(sc1);
        ts1.addNewParticipants(sc2);
        System.out.println();

        Team<Schoolar> ts2 = new Team<Schoolar>("School2");
        ts2.addNewParticipants(sc3);
        ts2.addNewParticipants(sc4);
        System.out.println();

//        Team<Student> tsd1 = new Team<Student>("Stud");
//        tsd1.addNewParticipants(st1);
//        tsd1.addNewParticipants(st2);
//
//        Team<Employee> te1 = new Team<Employee>("Empl");
//        te1.addNewParticipants(emp1);
//        te1.addNewParticipants(emp2);

        ts1.playWith(ts2);

    }

}
