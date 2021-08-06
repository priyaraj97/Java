package parallelstream;

public class Employee {
	  private String lastName;
	  private String firstName;
	  private String empId;
	  private int age;
	  private int salary;
	  
	  Employee(int salary){
	    this.salary = salary;
	  }
	  
	  public String getLastName() {
	    return lastName;
	  }
	  public void setLastName(String lastName) {
	    this.lastName = lastName;
	  }
	  public String getFirstName() {
	    return firstName;
	  }
	  public void setFirstName(String firstName) {
	    this.firstName = firstName;
	  }
	  public String getEmpId() {
	    return empId;
	  }
	  public void setEmpId(String empId) {
	    this.empId = empId;
	  }
	  public int getAge() {
	    return age;
	  }
	  public void setAge(int age) {
	    this.age = age;
	  }
	  
	  public String getFullName(){
	    return this.firstName + " " + this.lastName;
	  }
	 
	  public int getSalary() {
	    return salary;
	  }
	}