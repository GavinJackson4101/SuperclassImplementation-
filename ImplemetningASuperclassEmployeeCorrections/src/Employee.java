public class Employee {
    String firstName;
    String lastName;
    int employeeID;
    double salary;

    public Employee() //start of class
    {
        firstName=null;
        lastName=null;
        employeeID=0;
        salary=0.0;

    }
    public void setFirstName(String fname)//starts for first name
    {
        firstName = fname;
    }
    public String getFirstname()
    {
        return firstName;
    }
    public void setLastName(String lname)//start for last name
    {
        lastName = lname;
    }
    public String getLastName()
    {
        return lastName;
    }
    public void setEmployeeID(int empId)//submit for employee id
    {
        employeeID = empId;

    }
    public double getEmployeeID()
    {
        return employeeID;
    }
    public void setSalary(double s)//sets salary from ID
    {
        salary=s;
    }
    public double getSalary()
    {
        return salary;
    }
    public void EmployeeSummary()//set for the print of all information obtained
    {
        System.out.println("Employee Name: "+ firstName +" " +lastName+" Employee Id : "+employeeID + " salary: "+salary);
    }

}
