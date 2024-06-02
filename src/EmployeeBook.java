public class EmployeeBook {
    private final Employee[] employees = new Employee[10];

    public boolean add(Employee employee){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null){
                employees[i] = employee;
                return true;
            }
        }
        return false;
    }

    public void remove(int id){
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                continue;
            }
            if (employees[i].getId() == id) {
                employees[i] = null;
                break;
            }
        }
    }

    public Employee get(int id){
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public void printEmployees() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee);
        }
    }

    public  int sumSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            sum += employee.getSalary();
        }
        return sum;
    }

    public  int sumSalary(int departament) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public  Employee findMinSalary() {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public  Employee findMinSalary(int departament) {
        Employee min = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament && employee.getSalary() < min.getSalary()) {
                min = employee;
            }
        }
        return min;
    }

    public  Employee findMaxSalary() {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public  Employee findMaxSalary(int departament) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament && employee.getSalary() > max.getSalary()) {
                max = employee;
            }
        }
        return max;
    }

    public  double avarageSalary() {
        return (double) sumSalary() / employees.length;
    }

    public  double avarageSalary(int departament) {
        int countInDepartament = 0;
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament) {
                countInDepartament++;
            }
        }
        return (double) sumSalary(departament) / countInDepartament;
    }

    public  void printFIO() {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            System.out.println(employee.getName() + " " + employee.getMidleName() + " " + employee.getLastName());
        }
    }

    public  void indexSalary(int percent) {
        double indexValue = 1 + (percent / 100d);
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            employee.setSalary(employee.getSalary() * percent);
        }
    }

    public  void indexSalary(int departament, double percent) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament) {
                employee.setSalary((int) (employee.getSalary() * percent));
            }
        }
    }

    public void printEmployee(int departament) {
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartament() == departament)
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
        }
    }

    public void printEmployeesSalaryLess(int salary){
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() < salary) {
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
            }
        }
    }

    public void printEmployeesSalaryGreater(int salary){
        for (Employee employee : employees) {
            if (employee == null) {
                continue;
            }
            if (employee.getSalary() >= salary) {
                System.out.printf("%d %s %s %s %d %n", employee.getId(), employee.getName(), employee.getMidleName(), employee.getLastName(), employee.getSalary());
            }
        }
    }
}
