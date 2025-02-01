// Applicaion development for mobiles and desktops, web apps, Web servers, Games etc.
// Owned by Oracle and James Gosling
// Similiar to C/C++
// Backend for Netflix, Linkedin, Amazon etc=Stability and Scalability
// Popularity=~3 bllion

// Main method above:Same name as FIlename
// args:Parameter name(Common convention)
// COMPILE=> Javac A.java
// RUN=> Java A
// static=>Method belongs to the class.This aint an Instance.Helps JVM to call main meThod without creaing an Instance.
// Void=>No returns bu thr method.
// mains=>JVM looks for this.=>Starting point of a program.
// String(args[])=> Used to pass arguments to programs./ STRING=> PREDEFINED CLASS NAME



public class Introduction{          //In Java, the class name should be equivalent to the file name
    public static void main(String args[]){
        System.out.println("Hello World");
    }
}


// public class B {
//     public static void main(String[] args) {
//         System.out.println("Hello World!");

//         for (String arg : args) {
//             System.out.println(arg);
//         }
//     }
// }


// public class C{
// public static void main(String[] args){
//     int final x=3;
//     System.out.println("value of x=> " + x);

//    if(x>3){
//     System.out.println("Higher");
//    }
//    else{
//     x++;
//     System.out.println("Now Success x is " + x + " Victory");
//    } 
// }
// }

// public class D{
//     public static void main(String args[]){
//         String a ="babu";

//         // string a ="babu";    //JAVA IS CASE SENSITIVE
//         System.out.println(a);
//     }
// }


// DATATYPES--------------------------------------------------

// BOolean-T/F
// int-4 byte(-ve to +ve)
// char-2 byte unicode(ASCII)
// byte- 1 byte (-128 to 127)(USED FOR STORING MEMORY IN LARGE ARRAYS)
// short-2 byte(-ve to +ve)
// long-8 byte(0 to +ve)
// float-4 byte-7 decimals
// double-8 byte-16 decimal for float


// class E 
// {
//     public static void main(String args[])
//     {

//         // Creating and initializing custom character
//         char a = 'G';

//         // Integer data type is generally used for numeric values
//         int i = 89;

//         // use byte and short if memory is a constraint
//         byte b = 4;

//         //byte b1 = 7888888955;
//         // this will give error as number is larger than byte range


//         short s = 56;

//         // short s1 = 87878787878;
//         // this will give error as number is larger than short range

//         // by default fraction value is double in java
//         double d = 4.355453532;

//         // for float use 'f' as suffix as standard
//         float f = 4.7333434f;

//         // need to hold big range of numbers then we need this data type
//         long l = 12121;


//          String a="babu";

//         System.out.println("char: " + a);
//         System.out.println("integer: " + i);
//         System.out.println("byte: " + b);
//         System.out.println("short: " + s);
//         System.out.println("float: " + f);
//         System.out.println("double: " + d);
//         System.out.println("long: " + l);
//         System.out.println("sTRING: " + a);
//     }
// }


// CLASS->OBJECTS--------------------------------------------
// superclasses-nO PARENT CLASS    


//VARIABLES------------------------------------------------------------

// LOCAL Variables-inside block/method.
// Instance Variables-declared {ONLY} when object in a class declared  and destroyed when the object is destroyed.==>ACCESS specifiers used
// STATIC/CLASS Variables-similiar to instances.The difference is that static variables are declared using the static keyword within a class outside of any method, constructor, or block.
// Unlike instance variables, we can only have one copy of a static variable per class, irrespective of how many objects we create.Static variables are created at the start of program execution and destroyed automatically when execution ends.
//{Each object will have its own copy of an instance variable, whereas we can only have one copy of a static variable per class, irrespective of how many objects we create. Thus, static variables are good for memory management.}

    // AS NAME SUGGESTS==STATIC==> VALUR CHANGES FOR ALL CLASSES AS ITS STATIC
    // ALSO
    //     We can access instance variables through object references, and static variables can be accessed directly using the class name.


