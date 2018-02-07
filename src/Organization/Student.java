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
public class Student extends Person {

    public static enum Status{freshman,sophomore,junior,senior};
    public Status status;

    public Student(String name,String address,String phoneNumber,String emailAddress,Status status) {
        super(name,address,phoneNumber,emailAddress);
        this.status = status;
    }

    @Override
    public String toString() {
        return this.name+"\n\taddress : "+this.address+"\n\tphone : "+this.phoneNumber+"\n\temail : "+this.emailAddress+"\n\tstatus : "+this.status;
    }

    
    
}
