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
