import java.util.Date;

public class EmployeeController
{

    private EmployeeModel model;
    private EmployeeView view;




    public int getEmpId() {
        return model.getEmpId();
    }

    public void setEmpId(int empId) {
       model.setEmpId(empId);
    }




    public String getFirstName() {
        return model.getFirstName();
    }

    public void setFirstName(String firstName) {
        model.setFirstName(firstName);
    }



    public String getLastName() {
        return model.getLastName();
    }

    public void setLastName(String lastName) {
        model.setLastName(lastName);
    }



    public String getGender() {
        return model.getGender();
    }

    public void setGender(String gender) {
        model.setGender(gender);
    }




    public int getHiredDate() {
        return model.getHiredDate();
    }

    public void setHiredDate(int hiredDate) {
        model.setHiredDate(hiredDate);
    }



    public double getSalary() {
        return model.getSalary();
    }

    public void setSalary(double salary) {
        model.setSalary(salary);
    }

    public void updateView()
    {
        view.printEmployeeDetails(model.getEmpId(), model.getFirstName(), model.getLastName(), model.getGender(), model.getHiredDate(),  model.getSalary());

    }

}
