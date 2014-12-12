// class to represent a manager - inherits Emplyee
import java.util.ArrayList;
// class to represent a manager - inherits Emplyee
public class Manager extends Employee
{
  private ArrayList<Employee> directReports;
  private String department;
  public Manager(String first, String last, int age, double wage, int hours, String job, ArrayList<Employee> list, String dept )
  {
    super(first, last, age, wage, hours, job);
    for(int i=0; i<list.size(); i++)
    {
      directReports.set(i, (list.get(i)));
      department= dept;
   }
  }
  public String getDepartment()
  {
    return department;
  }
  public ArrayList<Employee> getDirectReports()
  {
    return directReports;
  }
  public String toString()
  {
    return "Manager: "+super.toString();
  }
  public void addDirectReport(Employee emp1)
  {
    directReports.add(emp1);
  }
  public void removeDirectReport(Employee emp1)
  {
    directReports.remove(emp1);
  }
  public void setDepartment( String dept)
  {
    department=dept;
  }
}
    
  
