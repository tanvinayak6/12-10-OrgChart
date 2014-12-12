// Super Class to represent a person
// Super Class to represent a person
public class Person 
{
  private String first;
  private String last;
  private int age;
  public Person()
  {
    first="";
    last="";
    age=0;
  }
  public Person(String f, String l, int age)
  {
    first=f;
    last=l;
    this.age=age;
  }
  public String getFirstName()
  {
    return first;
  }
  public String getLastName()
  {
    return last;
  }
  public int getAge()
  {
    return age;
  }
  public String toString()
  {
    return last+", "+first;
  }
  public void recordBirthday()
  {
    age++;
  }
}
    
