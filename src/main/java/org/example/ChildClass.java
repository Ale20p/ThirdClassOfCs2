package org.example;
import org.example.ExampleClass;

public class ChildClass extends ExampleClass{
    String name;
    int age;

    public ChildClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ChildClass(String name, int age, int iniValue, double doubValue, String stringValue) {
        super(stringValue);
        this.name = name;
        this.age = age;
    }
}
