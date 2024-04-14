
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Manager("Adam Kowalski", 4000);
        employees[1] = new Worker("Wojciech Szczesny", 5000);
        employees[2] = new Worker("Robert Lewandowski", 7000);
        employees[3] = new Worker("Jan Wolski", 2000500);
        employees[4] = new Worker("Kuba Blaszczykowski", 300000);

        int nonmanagercount = 0;
        for (Employee emp : employees) {
            if (!(emp instanceof Manager)) {
                nonmanagercount++;
            }
        }

        ((Manager) employees[0]).setNumberOfSubordinates(nonmanagercount);

        employees[0].setSalary(7500);

        System.out.println("Dane wszystkich pracowników:");
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}
