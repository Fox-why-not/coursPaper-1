
public class Main {

    public static void main(String[] args) {

        EmployeeBook book = new EmployeeBook();
        book.add(new Employee("Константин", "Эдуардович", "Циалковский", 12000, 1));
        book.add(new Employee("Владимир", "Николаевич", "Челомей", 31000, 4));
        book.add(new Employee("Дмитрий", "Анатольевич", "Медведев", 48000, 3));
        book.add(new Employee("Анастасия", "Ивановна", "Кость", 100000, 1));
        book.add(new Employee("Леонид", "Ильич", "Брежнев", 28000, 5));
        book.add(new Employee("Наталья", "Алексеевна", "Крылова", 99000, 4));
        book.add(new Employee("Юрий", "Алексеев", "Гагарин", 71000, 2));
        book.add(new Employee("Альберт", "Германов", "Энштейн", 111000, 3));

        book.printEmployees();
        System.out.println("///////////////////////");
        System.out.println(book.sumSalary());
        System.out.println("///////////////////////");
        System.out.println(book.findMinSalary());
        System.out.println("///////////////////////");
        System.out.println(book.findMaxSalary());
        System.out.println("///////////////////////");
        System.out.println(book.avarageSalary());
        System.out.println("///////////////////////");
        book.printFIO();
        System.out.println("///////////////////////");
        System.out.println(book.sumSalary(4  ));
        System.out.println("///////////////////////");
        System.out.println(book.findMaxSalary(1));
        System.out.println("///////////////////////");
        System.out.println(book.findMinSalary(2));
        System.out.println("///////////////////////");
        System.out.println(book.avarageSalary(4));
        System.out.println("///////////////////////");
        book.printEmployeesSalaryLess(30000);
        System.out.println("///////////////////////");
        book.printEmployeesSalaryGreater(40000);
        System.out.println("///////////////////////");
        book.printEmployee(4);
        System.out.println("///////////////////////");
        book.indexSalary(20);
        book.indexSalary(1, 1.15);
        book.printEmployee(4);
    }




}