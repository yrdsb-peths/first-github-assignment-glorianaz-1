public class Student()
{
  public String firstName();
  public String lastName();
  public int gradeLevel();

  public Student(String fName, String lName, int grade)
  {
    firstName = fName;
    lastName = lName;
    gradeLevel = grade; 
  }

  public String toString()
  {
    return firstName + " " + lastName + " is in grade: " + gradeLevel;
  }    
}
