
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Adam Kowalski", 4000);
        employees[1] = new Worker("Wojciech Szczesny", 5000);
        employees[2] = new Worker("Robert Lewandowski", 7000);
        employees[3] = new Worker("Jan Wolski", 2000500);
        employees[4] = new Worker("Kuba Blaszczykowski", 300000);

        ((Manager) employees[0]).setNumberOfSubordinates(4);

        ((Worker) employees[1]).setPosition("Cybersecurity Specialist");

        ((Worker) employees[4]).setPosition("Staz");

        System.out.println("Dane wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
