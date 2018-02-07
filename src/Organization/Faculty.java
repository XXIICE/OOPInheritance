/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

/**
 *
 * @author INT105
 */
public class Faculty extends Employee{
    
    private String officeHours;
    private String rank;

    public Faculty (String name, String address, String phoneNumber, String emailAddress, String office, double salary,String officeHours, String rank) {
        super(name, address, phoneNumber, emailAddress, office, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\tOffice Hour : "+this.officeHours+"\n\trank : "+this.rank;
    }
    
    
}
