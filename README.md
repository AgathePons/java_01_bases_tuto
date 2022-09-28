# Java bases

First steps in Java

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
- `String`: string

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
String favorites = "These cities are " +firstCity+ " and "+secondCity;
```

It is also possible to concatenate strings and integers:

```java
int numberOfPets = 3;
String secondCity = "Buenos Aires";
String favorites = "These cities are " +firstCity+ " and "+secondCity;
```
