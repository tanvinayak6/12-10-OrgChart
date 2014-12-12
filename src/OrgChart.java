// main program to drive org chart
// main program to drive org chart
public class OrgChart
{
  public static void main(String[] args)
  {
  Manager m1=new Manager("Mackenzie", "Zales", 17, 12.3, 12, "head cheerleader", directReports);
  Manager m2= new Manager("Shay", "Van Buren", 17, 11.3, 2, "socialite");
  Employee emp1=new Employee("Trisha", "Capeletti", 16, 66.4, 24, "fun-fun");
  Employee emp2=new Employee("Other", "Trisha", 16, 98.2, 12, "Professional Stupid");
  Employee emp3=new Employee("Deandra", "TheNewGirl", 30, 12.9, 12, "Good at Eating");
  ArrayList<Employee> directReports=new ArrayList<Employee>();
  directReports.add(emp1);
  directReports.add(emp2);
  }
}
  
