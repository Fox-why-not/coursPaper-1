import java.util.Arrays;

public class Main {

    private static final Employee[] employees = new Employee[4];

    public static void main(String[] args) {

        employees[0] = new Employee("Иван", "Иванов", "Иванов", 53000, 2);
        employees[1] = new Employee("Виталий", "Иванов", "Иванов", 65000, 5);
        employees[2] = new Employee("Констнтин", "Иванов", "Иванов", 12000, 1);
        employees[3] = new Employee("Виктор", "Иванов", "Иванов", 31000, 4);

        printEmployees();
        System.out.println("///////////////////////");
        System.out.println(sumSalary());
        System.out.println("///////////////////////");
        System.out.println(findMinSalary());
        System.out.println("///////////////////////");
        System.out.println(findMaxSalary());
        System.out.println("///////////////////////");
        System.out.println(avarageSalary());
        System.out.println("///////////////////////");
        printFIO();
        System.out.println("///////////////////////");
        System.out.println(sumSalary(4  ));
        System.out.println("///////////////////////");
        System.out.println(findMaxSalary(1));
        System.out.println("///////////////////////");
        System.out.println(findMinSalary(2));
        System.out.println("///////////////////////");
        System.out.println(avarageSalary(4));
        System.out.println("///////////////////////");
        printEmployeesSalaryLess(30000);
        System.out.println("///////////////////////");
        printEmployeesSalaryGreater(40000);
        System.out.println("///////////////////////");
        printEmployee(4);
        System.out.println("///////////////////////");
        indexSalary(20);
        indexSalary(1, 1.15);
        printEmployee(4);
    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static int sumSalary(int departament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee findMinSalary(int departament) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public static Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static Employee findMaxSalary(int departament) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public static double avarageSalary() {
        return sumSalary() / employees.length;
    }

    public static double avarageSalary(int departament) {
        int countInDepartament = 0;
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                countInDepartament++;
            }
        }
        return sumSalary(departament) / countInDepartament;
    }

    public static void printFIO() {
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getMidleName() + " " + employee.getLastName());
        }
    }

    public static void indexSalary(int percent) {
        double indexValue = 1 + (percent / 100d);
        for (Employee employee : employees) {
            employee.setSalary(employee.getSalary() * percent);
        }
    }

    public static void indexSalary(int departament, double percent) {
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament) {
                employee.setSalary((int) (employee.getSalary() * percent));
            }
        }
    }

    private static void printEmployee(int departament) {
        for (Employee employee : employees) {
            if (employee.getDepartament() == departament)
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
        }
    }

    private static void printEmployeesSalaryLess(int salary){
        for (Employee employee : employees) {
          if (employee.getSalary() < salary) {
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
            }
        }
    }

    private static void printEmployeesSalaryGreater(int salary){
        for (Employee employee : employees) {
            if (employee.getSalary() >= salary) {
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
            }
        }
    }


}