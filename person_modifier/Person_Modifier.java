
package person_modifier;


public class Person_Modifier {

   
    public static void main(String[] args) {
        Person person = new Person();
        
        person.setUsername("Kiran");
        person.setPassword("********");
        
        System.out.println("Username = " + person.getUsername());
        System.out.println("Password = " + person.getPassword());
         
//        Person mPerson = new Person();
//                mPerson.setName ("Kiran");
//                
//                System.out.println("Person name : " + mPerson.getName());
    }
    
}
