import java.util.ArrayList;
// class to represent a manager - inherits Emplyee
public class Manager extends Employee
{
  private ArrayList<Employee> directReports;
  private String department;
  public Manager(String first, String last, int age, double wage, int hours, String job, Manager m, ArrayList<Employee> list, String dept )
  {
    super(first, last, age, wage, hours, job,m);
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
    return "Manager: "+super.toString()+ "\n employees: "+directReports;
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
 public boolean equals(Object o)
  {
    
    if(o instanceof Manager){
      Manager other = (Manager) o;
      return getFirstName()== other.getFirstName() && getLastName()==other.getLastName() && getAge()==other.getAge() &&getWage()==other.getWage() && getHours() == other.getHours() && getJobTitle()==other.getJobTitle()&& getManager()==other.getManager()&& department==other.getDepartment();
    }
    else{
      return false;
    }
  }
}
    
  
