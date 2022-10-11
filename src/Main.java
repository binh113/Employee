import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Employee emp01 = new Employee(12, "binh", new Date(97, 6, 5), 2000.0);
        Employee emp02 = new Employee(20, "Nam", new Date(98, 3, 10), 3000.1);
        System.out.println("id nhân viên " + emp01.id + " số tuổi là " + emp01.getAge());
        System.out.println("id nhân viên " + emp02.id + " số tuổi là " + emp02.getAge());
        emp01.increaseSalary();
        emp02.increaseSalary();
        System.out.println("id nhân viên " + emp01.id + " lương tăng " + emp01.getSalary());
        System.out.println("id nhân viên " + emp02.id + " lương tăng " + emp02.getSalary());

    }
}