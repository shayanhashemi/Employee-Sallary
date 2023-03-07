
public class EmployeeTest {
    
    public static void main(String[] args) {
      
      //create two Employee objects
      Employee emp1 = new Employee("Shayan", "Hashemi", 5000);
      Employee emp2 = new Employee("Bahar", "Azizi", 6000);
      
      //print their annual salaries
      System.out.println("Employee 1 yearly salary: " + (emp1.getMonthlySalary()*12));
      System.out.println("Employee 2 yearly salary: " + (emp2.getMonthlySalary()*12));
      
      //increase their salaries by 10%
      emp1.setMonthlySalary(emp1.getMonthlySalary()*1.1);
      emp2.setMonthlySalary(emp2.getMonthlySalary()*1.1);
      
      //print their updated annual salaries
      System.out.println("Employee 1 new yearly salary: " + (emp1.getMonthlySalary()*12));
      System.out.println("Employee 2 new yearly salary: " + (emp2.getMonthlySalary()*12));
      
    }
    
  }
// code by shayan hashemi
