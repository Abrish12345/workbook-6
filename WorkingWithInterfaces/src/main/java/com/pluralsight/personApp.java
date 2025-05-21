package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class personApp {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<Person>();

        myFamily.add( new Person("Dana", "Wyatt", 63) );
        myFamily.add( new Person("Zachary", "Westly", 31) );
        myFamily.add( new Person("Elisha", "Aslan", 14) );
        myFamily.add( new Person("Ian", "Auston", 16) );
        myFamily.add( new Person("Zephaniah", "Hughes", 9) );
        myFamily.add( new Person("Ezra", "Aiden", 17) );
        myFamily.add( new Person("Ezra", "Aiden", 16) );



        //sort the list using collections.sort

        Collections.sort(myFamily);

        //sorting using a lamda function
       // Collections.sort(myFamily, (a,b)->a.getFirstName().compareTo(b.getFirstName())) ;

        //print the sorted list
        for(Person person : myFamily){
            System.out.println("First Name: " + person.getFirstName() +
                    " Last Name: " + person.getLastName() +
                    " Age: " + person.getAge() );
        }
    }

}
