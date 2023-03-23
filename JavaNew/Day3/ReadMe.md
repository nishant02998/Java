# Day 3
## Data types:
* Primitive type / Value Type( 8 )
    1. boolean  :   Not specified
    2. byte     :   1 byte
    3. char     :   2 bytes (Designed to support UNICODE characters )
    4. short    :   2 bytes
    5. int      :   4 bytes
    6. float    :   4 bytes
    7. double   :   8 bytes
    8. long     :   8 bytes

* Non Primitive type / Reference Type( 4 )
    1. Interface
    2. class
    3. Type Variable
    4. Array

* Java do not support sizeof operator.

## How to solve real world problem using oops
1. Understand clients requirement.
2. According to clients requirement analyze problem statment and design classes.
3. Group related data elements inside class.
4. Instantiate class i.e create isnatance of a class.( Process of creating instance of class is called instantiation). In this stage, fields get space inside instance and instance get space on heap.
    Value stored inside object / instance is called state.
5. If we want to process state of instance then we should call method on it.    
6. Define method and use this reference inside method to access fields. 

```java
class Test{
    int num1;   //Non static field / instance variable
    static int num2;   //Static field / class level variable

    //Concrete method
    void showRecord( ){ //Non static method /Instance method
        //TODO
    }

    //Concrete method
    static void displayRecord( ){   //Static Method / class level method
        //TODO
    }
}
class Program{
    public static void main(String[] args) {
        Test t = new Test( );   //Instantiation
        //Test t : reference 
        //new Test( ) : instance

        t.showRecord( );

        Test.displayRecord( );
    }
}
```

'A'     :   char ch;

123     :   byte/short/int/long number;

10.5f   :   float number;

3.142d  :   double number;

"SunBeam"   :   String name;

null    :   Designed to initialize reference variable

//int number = null;  //Not OK

Employee emp = null;    //OK

* If reference contains null value then it is called null reference variable / null object.
