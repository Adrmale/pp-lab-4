
public class Company {
    public static void main(String[] args) {
        Employee[] employees = new Employee[7];

        employees[0] = new Manager("Adam Kowalski", 4000);
        employees[1] = new Worker("Wojciech Szczesny", 5000);
        employees[2] = new Worker("Robert Lewandowski", 7000);
        employees[3] = new Worker("Jan Wolski", 2000500);
        employees[4] = new Worker("Kuba Blaszczykowski", 300000);
        employees[5] = new Manager("Jakub Kiwior", 80000); 
        employees[6] = new Worker("Jack Grealish", 60000); 

        // Zwiększenie pensji wszystkich pracowników o 500
        for (Employee emp : employees) {
            double newSalary = emp.getSalary() + 500;
            emp.setSalary(newSalary);
        }

        for (Employee emp : employees) {
            if (emp instanceof Manager) {
                ((Manager) emp).setNumberOfSubordinates(5);
                emp.setSalary(7500);
            }
        }

        System.out.println("Zaktualizowane informacje o pracownikach:");
        for (Employee emp : employees) {
            System.out.println(emp.toString());
        }
    }
}
