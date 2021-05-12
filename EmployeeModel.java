import java.util.Date;

public class EmployeeModel
{
    private int empId;
    private String firstName;
    private String lastName;
    private String gender;
    private int hiredDate;
    private double salary;


    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getHiredDate() {
        return hiredDate;
    }

    public void setHiredDate(int hiredDate) {
        this.hiredDate = hiredDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

