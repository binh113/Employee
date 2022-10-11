import java.util.Date;

public class Employee {
    int id;
    String name;
    Date dob;
    double salary;

    public Employee(int id, String name, Date dob, double salary) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob() {
        this.dob = dob;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary() {
        this.salary = salary;
    }

    public void increaseSalary() {
        this.salary = this.salary * 1.1;
    }

    public int getAge() {
        Date now = new Date();
        return now.getYear() - this.getDob().getYear();
    }


}

