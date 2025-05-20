package com.pluralsight;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    //Implement the compareTo method to sort by last name (then first name if needed)

    @Override
    public int compareTo(Person otherName) {
        int lastNameComparison = this.lastName.compareToIgnoreCase(otherName.lastName);
        if (lastNameComparison != 0) {

            return lastNameComparison;
        }
        int firstNameComparison = this.firstName.compareToIgnoreCase(otherName.getFirstName());
        if (firstNameComparison !=0){
            return firstNameComparison;
        }
        return Integer.compare(this.age, otherName.age);
    }
}

