package mapoperation;

import java.util.Arrays;
import java.util.List;

public class MapOperation {

    public static void main(String[] args) {
        MapOperation md = new MapOperation();
        List<Employee> empList = md.createList();
        System.out.println("--- Name of female employees ---");
        empList.stream()
               .filter(e -> (e.getSex() == 'F'))
               .map(e -> e.getName())
               .forEach(System.out::println);

    }
    
    // Stub method to create list of employee objects
    private List<Employee> createList(){
        List<Employee> empList = Arrays.asList(new Employee("E001", 40, "Ram", 'M', 5000), 
        new Employee("E002", 35, "Sheila", 'F', 7000), 
        new Employee("E003", 24, "Mukesh", 'M', 9000), 
        new Employee("E004", 37, "Rani", 'F', 10000));
        
        return empList;
    }
    class Employee {
        private String empId;
        private int age;
        private String name;
        private char sex;
        private int salary;
        Employee(String empId, int age, String name, char sex, int salary){
            this.empId = empId;
            this.age = age;
            this.name = name;
            this.sex = sex;
            this.salary = salary;
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
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public char getSex() {
            return sex;
        }
        public void setSex(char sex) {
            this.sex = sex;
        }
        public int getSalary() {
            return salary;
        }
        public void setSalary(int salary) {
            this.salary = salary;
        }       
    }
}