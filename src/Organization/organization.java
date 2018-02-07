
 /* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Organization;

/**
 *
 * @author INT105
 */
public class organization {
    public static void main(String[] args) {
        Student st = new Student("Ariya","SIT KMUTT","0959563239","ariya.bchxxiice@mail.kmutt.ac.th",Student.Status.freshman);
        Person p = new Person("Ariya","SIT KMUTT","0959563239","ariya.bchxxiice@mail.kmutt.ac.th");
        Employee e = new Employee ("Ariya","SIT KMUTT","0959563239","ariya.bchxxiice@mail.kmutt.ac.th","IT",10000);
//        System.out.println(st);
//        System.out.println("\tEmail gen : "+st.genEmail());
//        System.out.println(p.toString());
//        System.out.println(p.genEmail());
        System.out.println(e);
        System.out.println("\temail gen : "+p.genEmail());
    }   
}
