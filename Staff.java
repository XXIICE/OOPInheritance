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
public class Staff extends Employee {
//    private String office;
//    private double salary;
//    private Employee employee;
    private String title;

    public Staff(String name, String address, String phoneNumber, String emailAddress,String office,double salary,String title) {
        super(name,address,phoneNumber,emailAddress,office,salary);
       
        this.title = title;
    }

    @Override
    public String toString() {
        return super.toString()+"\n\ttitle : "+this.title;
    }
    


}
