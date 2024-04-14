
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Adam Kowalski", 4000);
        employees[1] = new Employee("Wojciech Szczesny", 5000);
        employees[2] = new Employee("Robert Lewandowski", 7000);
        employees[3] = new Employee("Jan Wolski", 2000500);
        employees[4] = new Employee("Kuba Blaszczykowski", 300000);

        System.out.println("Wyświetlone dane pracownika o indeksie 3:");
        System.out.println(employees[3]);

        employees[3].setSalary(60000);

        System.out.println("\nDane wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
