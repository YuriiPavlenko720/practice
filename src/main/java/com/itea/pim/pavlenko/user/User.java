package com.itea.pim.pavlenko.user;

public class User {
    private String firstName;
    private String lastName;
    private String login;
    private String password;
    private String eMail;

    public User (){
        this.firstName="None";
        this.lastName="None";
        this.eMail="Undefined";
    }

    public User(String firstName, String lastName, String eMail){
        this.firstName=firstName;
        this.lastName=lastName;
        this.eMail=eMail;
    }

    public User(User user){
        this.firstName= user.getFirstName();
        this.lastName=user.getLastName();
        this.eMail= user.getEMail();
    }

    public void info (){
        System.out.println("First Name: " + firstName);
        System.out.println("Second Name: " + lastName);
        System.out.println("Login: " + login);
        System.out.println("e-Mail: " + eMail);
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEMail(String EMail) {
        this.eMail = EMail;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLogin() {
        return login;
    }

    public String getEMail() {
        return eMail;
    }
}
