\-------------------------------------------------------------------------------------------------------------------------------

A class is a template for an object, and an object is an instance of a class.

A class creates a new data type that can be used to create objects.



When you declare an object of a class, you are creating an instance of that class.

Thus, a class is a logical construct. An object has physical reality. (That is, an object occupies space in memory.)



Objects are characterized by three essential properties: state, identity, and behavior.

The state of an object is a value from its data type. The identity of an object distinguishes one object from another.

It is useful to think of an object’s identity as the place where its value is stored in memory.

The behavior of an object is the effect of data-type operations.



The dot operator links the name of the object with the name of an instance variable.

Although commonly referred to as the dot operator, the formal specification for Java categorizes the . as a separator.

The 'new' keyword dynamically allocates(that is, allocates at run time)memory for an object \& returns a reference to it.

This reference is, more or less, the address in memory of the object allocated by new.

This reference is then stored in the variable.

Thus, in Java, all class objects must be dynamically allocated.



Box mybox; // declare reference to object

&#x20;    mybox = new Box(); // allocate a Box object

The first line declares mybox as a reference to an object of type Box. At this point, mybox does not yet refer to an

actual object. The next line allocates an object and assigns a reference to it to mybox. After the second line executes,

you can use mybox as if it were a Box object. But in reality, mybox simply holds, in essence, the memory address of the

actual Box object.

The key to Java’s safety is that you cannot manipulate references as you can actual pointers.

Thus, you cannot cause an object reference to point to an arbitrary memory location or manipulate it like an integer.



A Closer Look at new:

classname class-var = new classname ( );

Here, class-var is a variable of the class type being created. The classname is the name of the class that is being

instantiated. The class name followed by parentheses specifies the constructor for the class. A constructor defines

what occurs when an object of a class is created.



You might be wondering why you do not need to use new for such things as integers or characters.

The answer is that Java’s primitive types are not implemented as objects.

Rather, they are implemented as “normal” variables.

This is done in the interest of efficiency.



It is important to understand that new allocates memory for an object during run time.



Box b1 = new Box();

Box b2 = b1;

b1 and b2 will both refer to the same object. The assignment of b1 to b2 did not allocate any memory or copy any part

of the original object. It simply makes b2 refer to the same object as does b1. Thus, any changes made to the object

through b2 will affect the object to which b1 is referring, since they are the same object.

When you assign one object reference variable to another object reference variable, you are not creating a copy of the

object, you are only making a copy of the reference.



int square(int i){

&#x20;   return i \* i;

}

A parameter is a variable defined by a method that receives a value when the method is called. For example,

in square( int i), i is a parameter. An argument is a value that is passed to a method when it is invoked.

For example, square(100) passes 100 as an argument. Inside square( ), the parameter i receives that value.



NOTE:

Bus bus = new Bus();

lhs(reference i.e. bus) is looked by compiler \& rhs (object i.e. new Bus()) is looked by jvm

\------------------------------------------------------------------------------------------------------------------------------------------

## **QUICK RECAP**

**Java OOP — Short Revision Notes**



**These notes are designed for future interview/placement revision, not for learning every concept from scratch.**



**1. OOP Introduction**



OOP (Object-Oriented Programming) is a programming approach where programs are designed using objects that contain:



State → data/properties

Behavior → methods/functions



Example:



class Student {

&#x20;   String name;      // state

&#x20;   int age;          // state





&#x20;   void study() {    // behavior

&#x20;       System.out.println("Studying");

&#x20;   }

}



**Main OOP concepts**

**Encapsulation**

**Inheritance**

**Polymorphism**

**Abstraction**



**2. Class**



A class is a blueprint/template for creating objects.



class Student {

&#x20;   String name;

&#x20;   int age;





&#x20;   void study() {

&#x20;       System.out.println("Studying");

&#x20;   }

}



The class itself describes what a Student object should contain.



**3. Object**



An object is an instance of a class.



Student s1 = new Student();



Here:



Student → reference type

s1 → reference variable

new Student() → creates an object

Class vs Object

Class	Object

Blueprint	Actual instance

Logical entity	Runtime entity

Doesn't represent one specific student	Represents a specific student

Example: Student	Example: s1



Think:



Class → Student

&#x20;         ↓

&#x20;      Objects

&#x20;      ├── s1

&#x20;      ├── s2

&#x20;      └── s3



**4. Properties of an Object**



Objects generally have:



1\. State



Represented by instance variables.



String name;

int age;



2\. Behavior



Represented by methods.



void study() {

&#x20;   System.out.println("Studying");

}



3\. Identity



Each object is a distinct entity.



Student s1 = new Student();

Student s2 = new Student();



Even though both belong to Student, they are separate objects.



**5. Instance Variables**



Variables declared inside a class but outside methods are called instance variables.



class Student {

&#x20;   String name;

&#x20;   int age;

}



Each object gets its own copy.



Student s1 = new Student();

Student s2 = new Student();





s1.name = "Yamini";

s2.name = "Priya";



Here:



s1 → name = Yamini

s2 → name = Priya



**6. Accessing Instance Variables**



Use the object reference followed by .:



Student s1 = new Student();





s1.name = "Yamini";

s1.age = 21;





System.out.println(s1.name);

System.out.println(s1.age);



Syntax:



object.variable



**7. Creating Objects**



Basic syntax:



ClassName reference = new ClassName();



Example:



Student s1 = new Student();



Important distinction:



Student s1



creates a reference variable.



new Student()



creates the object.



**8. Dynamic Memory Allocation**



Objects created using new are allocated memory at runtime, generally in the heap.



Student s1 = new Student();



Conceptually:



Stack                 Heap





s1  ───────────────→  Student object

&#x20;                     name

&#x20;                     age



Don't over-focus on the exact JVM memory model at beginner level. The important interview concept is:



Objects are created dynamically at runtime and are stored in heap memory.



**9. Manipulating Objects**



You can modify object state through its reference.



Student s1 = new Student();





s1.name = "Yamini";

s1.age = 21;





s1.age = 22;



The object's state changes from:



age = 21



to:



age = 22



You can also call methods:



s1.study();



**10. Constructors**



A constructor is a special member used to initialize an object.



Characteristics:



Same name as class

No return type

Called automatically when object is created

Can be overloaded



Example:



class Student {





&#x20;   String name;

&#x20;   int age;





&#x20;   Student(String name, int age) {

&#x20;       this.name = name;

&#x20;       this.age = age;

&#x20;   }

}



Creating object:



Student s1 = new Student("Yamini", 21);



**11. Default Constructor**



If you don't write any constructor, Java provides a default constructor.



class Student {

&#x20;   String name;

&#x20;   int age;

}



Java effectively provides a no-argument constructor.



So:



Student s1 = new Student();



works.



Important interview point



If you create any constructor yourself, Java does not automatically provide the default/no-argument constructor.



class Student {





&#x20;   Student(String name) {

&#x20;       // ...

&#x20;   }

}



Now:



new Student();



will produce an error.





**12. Creating Constructors**



Example:



class Student {





&#x20;   String name;

&#x20;   int age;





&#x20;   Student(String name, int age) {

&#x20;       this.name = name;

&#x20;       this.age = age;

&#x20;   }

}



Constructor call:



Student s1 = new Student("Yamini", 21);



**13. this Keyword**



this refers to the current object.



Most common use:



class Student {





&#x20;   String name;





&#x20;   Student(String name) {

&#x20;       this.name = name;

&#x20;   }

}



Here:



this.name



means instance variable.



name



means constructor parameter.



Without this, the names would be ambiguous.





**14. Constructor Overloading**



Having multiple constructors with different parameter lists.



class Student {





&#x20;   String name;

&#x20;   int age;





&#x20;   Student() {

&#x20;   }





&#x20;   Student(String name) {

&#x20;       this.name = name;

&#x20;   }





&#x20;   Student(String name, int age) {

&#x20;       this.name = name;

&#x20;       this.age = age;

&#x20;   }

}



This is constructor overloading.



It is an example of compile-time polymorphism.





**15. Calling One Constructor From Another**



Use:



this(...)



Example:



class Student {





&#x20;   String name;

&#x20;   int age;





&#x20;   Student() {

&#x20;       this("Unknown", 0);

&#x20;   }





&#x20;   Student(String name, int age) {

&#x20;       this.name = name;

&#x20;       this.age = age;

&#x20;   }

}

Important



this() must be the first statement inside the constructor.





**16. Why Don't We Use new for Primitive Types?**



Primitive types:



int

char

float

double

boolean

byte

short

long



are not objects.



You simply write:



int x = 10;



You don't write:



new int(10); // invalid



Objects, however, are created using new:



Student s = new Student();



**17. Memory Allocation of new**



When you execute:



Student s = new Student();



conceptually:



&#x20;         Stack

&#x20;       ┌─────────┐

s ─────→│ reference│

&#x20;       └────┬────┘

&#x20;            │

&#x20;            ↓

&#x20;         Heap

&#x20;       ┌─────────────┐

&#x20;       │ Student     │

&#x20;       │ name        │

&#x20;       │ age         │

&#x20;       └─────────────┘



new creates an object and returns a reference to it.





**18. Wrapper Classes**



Every primitive has a corresponding wrapper class.



Primitive	Wrapper

byte	Byte

short	Short

int	Integer

long	Long

float	Float

double	Double

char	Character

boolean	Boolean



Example:



int x = 10;





Integer y = 10;



Integer is an object/reference type.



Why are wrappers important?



Collections work with objects:



ArrayList<Integer> list = new ArrayList<>();



You cannot use:



ArrayList<int> list; // invalid





**19. Autoboxing and Unboxing**



**Autoboxing**



Primitive → Wrapper



int x = 10;

Integer y = x;



Java automatically converts int to Integer.



**Unboxing**



Wrapper → Primitive



Integer x = 10;

int y = x;

20\. final Keyword



final means something cannot be changed/reassigned, depending on where it is used.



Final variable

final int MAX = 100;



You cannot do:



MAX = 200; // error

Final method



A final method cannot be overridden by subclasses.



Final class



A final class cannot be inherited.



final class Student {

}



**You cannot:**



class CollegeStudent extends Student {



}



**21. Garbage Collection**



Java automatically manages memory.



When an object is no longer reachable, it becomes eligible for garbage collection.



Example:



Student s = new Student();





s = null;



The previously created Student object no longer has a reference from s.



Conceptually:



Before:





s ─────→ Student object









After:





s → null





Student object → unreachable



The Garbage Collector (GC) can eventually reclaim that memory.



Important



You should not assume exactly when garbage collection happens.



System.gc() is only a request/hint to the JVM, not a guarantee.





**Final 1-Minute Revision**



**When revising OOP later, remember this chain:**



**CLASS**

&#x20; **↓**

**Blueprint**

&#x20; **↓**

**OBJECT**

&#x20; **↓**

**Created using new**

&#x20; **↓**

**Object has STATE + BEHAVIOR + IDENTITY**

&#x20; **↓**

**Instance variables store state**

&#x20; **↓**

**Methods provide behavior**

&#x20; **↓**

**Constructor initializes object**

&#x20; **↓**

**this → current object**

&#x20; **↓**

**Constructor overloading → multiple constructors**

&#x20; **↓**

**Wrapper classes → primitives as objects**

&#x20; **↓**

**final → prevents modification/overriding/inheritance**

&#x20; **↓**

**Garbage Collector → removes unreachable objects**



