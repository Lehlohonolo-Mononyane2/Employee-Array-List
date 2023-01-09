/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vut.data;

/**
 *
 * @author L Mononyane
 */
public class Address
{
    private String street;
    private String town;

    public Address(String street, String town)
    {
        setStreet(street);
        setTown(town);
    }
    
    public String getStreet()
    {
        return street;
    }

    public String getTown()
    {
        return town;
    }

    public void setStreet(String street)
    {
        if (street.length() > 3)
            this.street = street;
        else
            throw new IllegalArgumentException("Invalid street. Street too short");
    }

    public void setTown(String town)
    {
        this.town = town;
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "{" + "street=" + street + ", town=" + town + '}';
    }    
}