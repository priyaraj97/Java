package parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TotalEmployee {

  public static void main(String[] args) {
    Salary sal = new Salary();
    List<Employee> empList = createList();
    empList.parallelStream().forEach(sal::doProcess);
    
    System.out.println("Total - " + sal.getTotalSalary());

  }
  // Stub method to create list of employee objects
  private static List createList(){
    List<Employee> empList = IntStream.rangeClosed(1, 500).mapToObj(Employee::new)
      .collect(Collectors.toList());
    return empList;
  }
}

class Salary{
  //shared variable
  private int total = 0;

  public void doProcess(Employee emp){
    addSalary(emp.getSalary());
  }

  public void addSalary(int salary){
    total = total + salary;
  }
  public int getTotalSalary(){
    return total;
  
  }
}