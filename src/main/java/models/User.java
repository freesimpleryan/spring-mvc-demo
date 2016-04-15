package models;

import org.springframework.http.converter.AbstractHttpMessageConverter;

/**
 * Created by Ryan on 4/13/2016.
 */
public class User{

    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public User(){}
    public User(String id, String firstName, String lastName, String email){
        this.id = 0;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getId(){return id;}
    public String getFirstName(){return firstName;}
    public String getLastName(){return lastName;}
    public String getEmail(){return email;}

    public void setId(int id){this.id = id;}
    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setEmail(String email){this.email = email;}
}
