package com.example.demo;

public class GenericStaticDemo {
    // A Generic method example
    static <T> String genericDisplay(T element)
    {
        System.out.println(element.getClass().getName()+ " = " + element);
        return element.getClass().getName()+ " = " + element;  //  .getName()+ " = " + element;
    }

    // Driver method
    public static void main(String[] args)
    {
        // Calling generic method with Integer argument
        genericDisplay(11l);

        // Calling generic method with String argument
        genericDisplay("element");

        // Calling generic method with double argument
        genericDisplay(1.0f);
    }
}
