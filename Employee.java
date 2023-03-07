
public class Employee {

    private String firstName;
    private String lastName;
    private double monthlySalary;

    //Constructor
    public Employee(String fName, String lName, double mSalary) {
        firstName = fName;
        lastName = lName;
        if(mSalary > 0) {
            monthlySalary = mSalary;
        }
    }

    //getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    //setters
    public void setFirstName(String fName) {
        firstName = fName;
    }

    public void setLastName(String lName) {
        lastName = lName;
    }

    public void setMonthlySalary(double mSalary) {
        if(mSalary > 0) {
            monthlySalary = mSalary;
        }
    }

}
//code by shayan hashemi