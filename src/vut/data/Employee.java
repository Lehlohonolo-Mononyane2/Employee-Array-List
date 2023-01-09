
package vut.data;

/**
 Store the staff number, name and salary of an employee
 @author L Mononyane
 */
public class Employee
{
    private String name;
    private double salary;
       
    private Address homeAddress;
    
    /**
    Create a default employee object with:
    0 as the staff number, "None" as the name and 1000 as the salary
    */
    public Employee()
    {
        this( "None", 1000.00, new Address("no street", "no town"));
    }

    public Employee(String name, double salary, Address homeAddress)
    {
        setName(name);
        setSalary(salary);
        setHomeAddress(homeAddress);
    }

    public void setHomeAddress(Address homeAddress)
    {
        this.homeAddress = homeAddress;
    }
    
       /**
     Change the name of the object
     @param name The new name
     */
    public void setName(String name)
    {
        if (name.length() < 3)
            throw new IllegalArgumentException("Name invalid.  Name too short.");
        this.name = name;
    }

    //No javadoc comment for this method - it is not a public method
    //private methods are for the own class' use. Salaries will be changed
    //using the increaseSalary method
    private void setSalary(double salary)
    {
        if (salary < 0)
            throw new IllegalArgumentException("Salary invalid.  Salary Negative.");
        this.salary = salary;
    }

   
    /**
     Return the name of the employee
     @return the name of the employee
     */
    public String getName()
    {
        return name;
    }

    /**
     Return the salary of the employee
     @return the salary of the employee
     */
    public double getSalary()
    {
        return salary;
    }

    public Address getHomeAddress()
    {
        return homeAddress;
    }
    
    /**
     Increase the salary by the given percentage
     @param percentage The percentage to increase the salary with.  Must be  0-100
     */
    public void increaseSalary(double percentage)
    {
        if (percentage < 0 || percentage > 100)
            throw new IllegalArgumentException("Percentage invalid. Must be 0 - 100."
                +   "Invalid value:" + percentage);
        
        salary += salary * percentage / 100;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "[name=" + name+ ", salary=" + salary 
                + ",home address:" + homeAddress.getStreet() 
                + "," + homeAddress.getTown() + "]";
    }
}
