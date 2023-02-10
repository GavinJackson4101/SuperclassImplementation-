public class Manager extends Employee {//set of abstract class
    private String department;

    public Manager() {
        super();
        department = null;
    }
    public void setDepartment(String dept) {//set of department
        department=dept;
    }

    public String getDepartment() {
        return department;
    }

    public void EmployeeSummary() {//print of employee summary
        super.EmployeeSummary();
        System.out.println("Department : " + department);
    }
}

