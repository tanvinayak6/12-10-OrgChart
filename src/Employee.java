// class to represent an emplayee - inherits Person
// class to represent an employee - inherits Person
public class Employee extends Person
{
  private double hourlyWage;
  private int hoursWorked;
  private String jobTitle;
  private Manager m;
  public Employee(String fr, String la, int a, double wage, int hours, String job, Manager i)
  {
    super(fr, la, a);
    hourlyWage=wage;
    jobTitle=job;
    m=i;
   
    
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public void setManager(Manager newman)
  {
    m=newman;
  }
  public Manager getManager()
  {
    return m;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    return hoursWorked*hourlyWage;
  }
  public double getYearlySalary()
  {
    return hoursWorked*hourlyWage*52;
  }
  public String getJobTitle()
  {
    return jobTitle;
  }
  public String toString()
  {
    return super.getLastName()+", "+super.getFirstName()+": "+jobTitle+" @ "+hourlyWage*hoursWorked*52;
  }
  public boolean equals(Object o)
  {
    
    if(o instanceof Employee){
      Employee other = (Employee) o;
      return getFirstName()== other.getFirstName() && getLastName()==other.getLastName() && getAge()==other.getAge() && getWage()== other.getWage() && getHours() == other.getHours() && getJobTitle()==other.getJobTitle()&& getManager()==other.getManager();
    }
    else{
      return false;
    }
  }
}
