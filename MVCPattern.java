public class MVCPattern {
    public static void main(String[] args) {

        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController();
        controller.updateView();
        controller.setEmpId(12);
        controller.updateView();


    }

    public static EmployeeModel retriveDataFromDB() {

        EmployeeModel employeeModel = new EmployeeModel();
        employeeModel.setEmpId(13);
        employeeModel.setFirstName("Omer");
        employeeModel.setLastName("Ahmed");
        employeeModel.setGender("Male");
        employeeModel.setHiredDate(12-05-2021);
        employeeModel.setSalary(50000);

        return employeeModel;
    }


}
