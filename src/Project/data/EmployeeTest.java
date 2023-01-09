/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project.data;

/**
 * Test the employee class
 *
 * @author L Mononyane
 */
public class EmployeeTest
{

    public static void main(String[] args)
    {
        Employee empObj = new Employee("Sue Motloung", 10000, new Address("Church", "Vanderbiojlpark"));

        System.out.println("Data:" + empObj.toString());
        System.out.println("Expected: number=1000, name = Sue Motloung,salary=10000\n\n");

        System.out.println("Increase salary by 10%");
        empObj.increaseSalary(10);
        System.out.println("Data:" + empObj.toString());
        System.out.println("Expected: number=1000, name = Sue Motloung,salary=11000\n\n");

        try
        {
            System.out.println("Increase salary by -10%");
            empObj.increaseSalary(-10);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Exception encountered:" + ex.getMessage());
        }
        System.out.println("Data:" + empObj.toString());
        System.out.println("Expected: number=1000, name = Sue Motloung,salary=11000\n\n");

        try
        {
            System.out.println("Increase salary by 101%");
            empObj.increaseSalary(101);
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println("Exception encountered:" + ex.getMessage());
        }
        System.out.println("Data:" + empObj.toString());
        System.out.println("Expected: number=1000, name = Sue Motloung,salary=11000\n\n");
    }

}
