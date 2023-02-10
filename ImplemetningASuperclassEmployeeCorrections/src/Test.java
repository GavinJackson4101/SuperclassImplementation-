public class Test//test for all of information in previous classes
{
    public static void main (String[] args) {
        Manager mgr = new Manager();
        mgr.setFirstName("Gavin");
        mgr.setLastName("Jackson");
        mgr.setEmployeeID(43223);
        mgr.setSalary(7500);
        mgr.setDepartment("Finances");
        mgr.EmployeeSummary();

    }
}

