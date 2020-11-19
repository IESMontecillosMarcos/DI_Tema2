/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package di_432_libretadirecciones;

import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Marcos GOnzalez Leon
 */
public class Person {
    
   //Attributes.
   private final SimpleStringProperty firstName = new SimpleStringProperty("");
   private final SimpleStringProperty lastName = new SimpleStringProperty("");
   private final SimpleStringProperty email = new SimpleStringProperty("");

   // Constructors.
    public Person() {
        this("", "", "");
    }
 
    public Person(String firstName, String lastName, String email) {
        setFirstName(firstName);
        setLastName(lastName);
        setEmail(email);
    }

    // Getters & Setters.
    public String getFirstName() {
        return firstName.get();
    }
 
    public void setFirstName(String fName) {
        firstName.set(fName);
    }
        
    public String getLastName() {
        return lastName.get();
    }
    
    public void setLastName(String fName) {
        lastName.set(fName);
    }
    
    public String getEmail() {
        return email.get();
    }
    
    public void setEmail(String fName) {
        email.set(fName);
    }
}
