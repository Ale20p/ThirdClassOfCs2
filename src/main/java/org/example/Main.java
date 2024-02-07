package org.example;

public class Main {
    public static void main(String[] args) {
        ExampleClass defaultInstance = new ExampleClass();
        defaultInstance.displayValues();

        ExampleClass oneMoreObject = new ExampleClass();
        oneMoreObject.iniValue = 999;
        oneMoreObject.doubValue = 1000.15;
        oneMoreObject.stringValue = "Vanier College";
        oneMoreObject.displayValues();
        oneMoreObject.performCalculation();

        ExampleClass parameterizedInstance = new ExampleClass(100, 43.6, "Hello");
        parameterizedInstance.displayValues();

        ExampleClass copyInstance = new ExampleClass(parameterizedInstance);
        copyInstance.displayValues();

        ExampleClass overloadInstance1 = new ExampleClass(250, 99.9);
        overloadInstance1.displayValues();

        ExampleClass overloadInstance2 = new ExampleClass("Montreal");
        overloadInstance2.displayValues();
    }
}