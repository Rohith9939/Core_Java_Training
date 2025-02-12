package com.celcom.day7;

interface myInterface {
    void display();
}

public class AnonymousClass implements myInterface {

    public void display() {
        System.out.println("Anonymous Inner Class");
    }

    public static void main(String[] args) {
        // Normal implementation of the interface
        AnonymousClass obj = new AnonymousClass();
        obj.display();  // prints "Anonymous Inner Class"

        // Anonymous Inner Class implementation
        myInterface obj1 = new myInterface() {
            public void display() {
                System.out.println("Displayy");
            }
        };
        obj1.display();  // prints "Display"

        // Lambda expression implementation
        myInterface obj3 = () -> System.out.println("Lambda Display");
        obj3.display();  // prints "Lambda Display"
    }
}
