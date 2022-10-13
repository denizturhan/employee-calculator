import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the employee: ");
        String name = scanner.nextLine();
        System.out.println("Enter the salary of the employee: ");
        int salary = scanner.nextInt();
        System.out.println("Enter the work hours of the employee: ");
        int workHours = scanner.nextInt();
        System.out.println("Enter the hire year of the employee: ");
        int hireYear = scanner.nextInt();
        Employee employee = new Employee(name, salary, workHours, hireYear);
        System.out.println(employee);
        //Scanner close
        scanner.close();
    }
}
