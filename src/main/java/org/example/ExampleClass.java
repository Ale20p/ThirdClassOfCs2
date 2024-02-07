package org.example;
import org.example.ChildClass;

public class ExampleClass {
    int iniValue;
    double doubValue;
    String stringValue;

    public ExampleClass() {
        iniValue = 0;
        doubValue = 0.0;
        stringValue = "Default";
    }
    // parameterized contructer
    public ExampleClass(int iniValue, double doubValue, String stringValue) {
        this.iniValue = iniValue;
        this.doubValue = doubValue;
        this.stringValue = stringValue;
    }

    //copy constructor
    public ExampleClass(ExampleClass other) {
        this.iniValue = other.iniValue;
        this.doubValue = other.doubValue;
        this.stringValue = other.stringValue;
    }

    //contructor overloading
    ExampleClass(int iniValue, double doubValue) {
        this.iniValue = iniValue;
        this.doubValue = doubValue;
        this.stringValue = "Overload";
    }

    ExampleClass(String stringValue) {
        this.iniValue = 42;
        this.doubValue = 10.5;
        this.stringValue = stringValue;
    }

    void displayValues() {
        System.out.println("IniValue: " + iniValue);
        System.out.println("DoubValue: " + doubValue);
        System.out.println("StringValue: " + stringValue);
    }

    // additional methods
    void performCalculation() {
        System.out.println("Peforming Calculations");
    }

    String getStringValue() {
        return stringValue;
    }

    void setIniValue(int iniValue) {
        this.iniValue = iniValue;
    }

}
