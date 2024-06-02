import java.util.Objects;

public class Employee {

    private static int idGenerator = 1;

    private final int id;
    private final String name;
    private final String midleName;
    private final String lastName;
    private  int salary;
    private int departament;

    public Employee(String name, String midleName, String lastName, int salary, int departament) {
        this.id = idGenerator++;
        this.name = name;
        this.midleName = midleName;
        this.lastName = lastName;
        this.salary = salary;
        this.departament = departament;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMidleName() {
        return midleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartament() {
        return departament;
    }

    public void setDepartament(int departament) {
        this.departament = departament;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", midleName='" + midleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                ", departament=" + departament +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && salary == employee.salary && departament == employee.departament && Objects.equals(name, employee.name) && Objects.equals(midleName, employee.midleName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, midleName, lastName, salary, departament);
    }
}

