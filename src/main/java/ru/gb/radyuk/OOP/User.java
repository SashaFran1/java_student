package ru.gb.radyuk.OOP;

public class User {
    private String firstName;
    private String lastName;
    private String eMail;
    private int age;
    private boolean male;

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName1) {
        firstName = firstName1;
    }

    public void setAge(int age1) {
        if (age1 >= 0 && age1 < 250) {
            age = age1;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String geteMail() {
        return eMail;
    }

    public void setEmail(String eMail) {
        this.eMail = eMail;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public void getInfo(){
        System.out.println("Имя: " + getFirstName() + ", фамилия: " + getLastName() +
                ", email: " + geteMail() + ", возраст: " + getAge() +
                ", пол: " + geteMail());
    }

    public User(String firstName, String lastName, String eMail, int age, boolean male) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
        setAge(age);
        this.male = male;
    }

}
