package com.example.demo;
// We use < > to specify Parameter type
class Test1<T> {
    // An object of type T is declared
    T obj;
    Test1(T obj) { this.obj = obj; } // constructor
    public T getObject() { return this.obj; }
}

// Driver class to test above
public class GenericTest {
    public static void main(String[] args)
    {
        // instance of Integer type
        Test1<Integer> iObj = new Test1<Integer>(15);
        System.out.println(iObj.getObject());

        // instance of String type
        Test1<String> sObj
                = new Test1<String>("15");
        System.out.println(sObj.getObject());
       // iObj = sObj; // This results an error
        if(iObj.equals(sObj))
        {
            System.out.println("Both are equal without string");
        }
        else if(iObj.toString().equals(sObj.toString()))
        {
            System.out.println("Both are equal with tostring()");
        }
        else if(iObj.getObject().toString().equals(sObj.getObject().toString()))
        {
            System.out.println("Both are equal with getObject().tostring()");
        }
        else
        {
            System.out.println("Both are not equal ");
        }
    }
}