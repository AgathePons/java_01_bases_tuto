# Java bases

First steps in Java.

Java is an Object oriented language created by James Gosling and Patrick Naughton.

The softwares written in Java are compiled to an intermediate binary representation that can be executed in a 
Java virtual machine (**JVM**).  
So, the **compiler** compiles the code in byteCode (the machine language, the binary code), then, the 
**interpreter** translates the byteCode into instructions to execute the program.

## Declare variables

> type name = value

```java
int myNumber = 15;
String myString = "Hello World!";
```

It is possible to declare without value :

```java
int myOtherNumber;
```

If a variable has no value, it cannot be used, it throws an error.

Variables (non constant) can be reassigned:

```java
myNumber += 2 // => 17 (15 + 2)
```

It is possible to declare a constant variable adding `final` before the type (constant are written upper case):

```java
final int CONSTANTNUMBER = 7;
```

## Primitive types

The primitive types for variable.

Numeric types:

- `int`: integer
- `long`: big integer
- `float`: floating number
- `double`: floating number with more decimal places (used by default for decimal numbers)

Other types:

- `boolean`: boolean

Special :

- `String`: string

`String` is not a primitive type because it is a class. When a String variable is declared, a new instance of 
the class is created and it gives access to all the String methods.

## Numeric operations

It is possible to mix numeric types but we have to pay attention of the types we manipulate, for example:

```java
int numberA = 5;
int numberB = 2;
int numberC = numberA / numberB; // => 2
```

Because numberC is an integer, it cannot have any decimal, but even if we write `float numberC`, the result is 
now `2.0`.  
It is because numberA and numberC are both integers. To have a good answer, we can change the type of numberA 
**and/or** numberB, but maybe we do not want to change the type of our variables.  
We can cast our variables (or just one is enough) in another type using this notation:

```java
float numberC = (float) numberA / (float) numberB; // => 2.5
```

## Boolean

To declare a boolean:

```java
boolean isDoingSomething = true;
```

It is possible to switch easily with the **logical no**:

```java
isdoingSomething = !isDoingSomething // => false
isdoingSomething = !isDoingSomething // => true
```

## String

String is a special type because it is an **object**.  
Strings can be concatenated:

```java
String firstCity = "New York";
String secondCity = "Buenos Aires";
String favorites = "These cities are " +firstCity + " and "+secondCity;
```

It is also possible to concatenate strings and integers:

```java
int numberOfPets = 3;
String secondCity = "Buenos Aires";
String favorites = "These cities are " +firstCity+ " and "+secondCity;
```

## Functions

A function is a code bloc that executes instructions. When the function is named `main` the service executed 
is the program itself.  
The `main` function is the **entry point** of the program, and it is contained in a class itself. Finally, 
the **class** containing the **function** belongs to a **package**.

When a function is inside a class, it is called a **method**.

## Classes

A class is made of:

- variables named **attributes**
- behaviors named **methods**

In Java, all the code has to be in class.

### Model classes

Used to model a domain of the application.

Example: the `String` class used to stock and manipulate strings. This class is available in the `java.lang` 
package which is provided by the `java.base` library.

When a class is written, it has to be documented in **Javadoc** using `/** */`.

### Utility classes

Utility classes contain static methods that can be called directly on the class.  
For example the class named `functions` of this project is an utility class, where the method `sayHelloTo` 
can be used.

## Scope in Java

Scopes in Java are similar to scope in JS. 

### Scope, global and local variables
 
The variables scope depends on the location where they are declared in the code. Each variable is available
in the context where it has been declared (code bloc).

Variable scope can be **local** or **global** according to its location.  
A **global** variable is available for all classes and methods of a program, whereas **local** variable is
available only in the method where it is declared.

For example:

```java
class Kitten {
    static boolean isSoCute = true;
    static int numberOfPatpatToGive = 10;
    
    public static void sleep() {
        int minuteToSleep = 120;
        // can access to isSoCute and numberOfPatpatToGive
        // cannot access to minuteToPlay
    }
    
    public static void play() {
        int minuteToPlay = 30;
        // can access to isSoCute and numberOfPatpatToGive
        // cannot access to minuteToSleep
    }
}
```

Here, `isSoCute` and `numberOfPatpatToGive` are **global** so they can be used anywhere in another code bloc.


So it is possible to do so:

```java
Kitten myKitten = new Kitten();

System.out.println("Miaou, give me " + myKitten.numberOfPatpatToGive + "pat pat!");

myKitten.numberOfPatpatToGive = 0;
System.out.println(myKitten.numberOfPatpatToGive); // 0
```

It can be dangerous and have side effect to let the possibility to modify these global variables.

### Access control

It is possible to control the access to variables or methods.

```java
public class MyClass {
    public static void main(String[] args) {
    
        System.out.println(AccessTest.firstText); // OK
        System.out.println(AccessTest.secondText); // KO
        
        AccessTest.firstMethod(); // OK
        AccessTest.secondMethod(); // KO
    }
}

class AccessTest {
    public static String firstText = "Hello, I am public.";
    private static String secondText = "Hello, I am private.";
    
    public static void firstMethod() {
        System.out.println(secondText);
    }
    private static void secondMethod() {
        System.out.println(secondText);
    }
}
```

The key words are:

- **public**: available for all
- **protected**: available for the package and its sub classes (if a class is extended in another package, 
the other package can access the protected element)
- **package-protected**: available only in the package where it is. It is the default parameter if
nothing is specified. Because it is implicit and cannot be declared, and because Java is a wordy language 
where we have to be very specific, the default `package protected` can be a an oversight of the dev who wrote 
it, so it is usually never used, and Java dev prefer to always specify something else.
- **private**: available only in its context

An element contained into an other can have the same level of access control, or have a lower level.

For example:

```java
class MyClass {
    int numberOne = 1; // package-private by default
    protected int numberTwo = 2; // protected is higher than MyClass, so it is converted to package-private
    public boolean isSomething = true; // likewise for public
    private String myString = "Hello!"; // private is lower than MyClass so it is private
}
```

**Note**: A first level class cannot be `private` because that would mean the class just cannot be used, so it 
is useless.

When a variable from a class is declared, if the access control of the declaration context is higher than the 
access control of the class called, so the variable **must have** an explicit level of access control equal or 
lower than the class called.

For example:

```java
private MyClass {
    ...blablabla
}

MyClass firstClass = new MyClass(); // error
private MyClass secondClass = new MyClass(); // OK
```

## Loops in Java


### Basic for loop

As usual:

```java
for (int i = 0; i <= 5; i++) {
    // do something
}
```

Loop with collections:

```java
int[] myArray = new int[]{7,2,4};
for (int i = 0; i < myArray.length; i++) {
    System.out.println(myArray[i]);
}
```

### Java for each loop

```java
for (int number: myArray) {
    System.out.println(number);
}
```

### Conditional loop

Loop `while... true`.

If the condition is false since the start, the `while... true` is never executed, because the condition is 
checked first.

```java
int hugs = 0;
while (hugs < 50) {
    hugs = (int) (Math.random() * ((100 - 1) + 1) + 1);
    System.out.println("Hugs received: " + hugs);
}
```

Loop `do... while`.

If the condition is false since the start, the `do... while` is executed at least once, because the `while` 
condition is checked after the `do`.

```java
double randomNumber = (double) (Math.random());
do {
    randomNumber = (double) (Math.random());
    System.out.println("Hourra!!");
} while (randomNumber <= 0.5);
```

### The `continue` and `break` instructions

Not to execute the instruction in some loops, it is possible to use the key word `continue` to switch directly 
to the next loop.

```java
int numberToIgnore = 3;
for (int i = 0; i < 10; i++) {
    if (i == numberToIgnore) {
        continue;
    }
    System.out.println("I have the number " + i);
}
```

To stop the loop before its end, it is possible to use the key word `break` to exit the loop.

```java
int numberToFind = 4;
for (int i = 0; i < 10; i++) {
    if (i == numberToFind) {
        System.out.println("I found a " + i);
        break;
    }
    System.out.println("I search a " + numberToFind + " but I found a " + i);
}
```

## Conditions

### If / else

As usual:

```java
if (isTrue) {
    doSomething();
}
else {
    doSomethingElse();
}
```

It is possible to use `else if` for multiple cases.

### Switch 

As usual

```java
switch(onSometing) {
    case firstThing:
        doSomething();
        break;
    case secondThing:
        doSomethingElse();
        break;
    case thirdThing:
        doOtherThing();
        break;
    default:
        doDefaultThing();
}
```


--------------------------------------------
