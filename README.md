# PACKAGE
## Question 1 (collegeMgt)

-> Define two different classes namely, Student (store in package stu) and Employee. These classes are derived from a base class Person (store in package per1).
-> Define other two classes Staff and Faculty. Staff and Faculty classes are derived from Employee class. Employee, Staff and Faculty are stored in the package emp.
-> The Person class has name and age data and display method to display the name and age of a person.
-> The Student class has data like rollNo and branch and display method to display name, age, rollNo and branch of the student.
-> Faculty has designation data (Assistant Professor, Associate Professor and Professor) and display method to display the name, age, EmpId, doj and designation of the Faculty.
-> Staff has EmpId and doj(date of joining) data, designation data (Technical and Clerical) and display method to display the name, age, EmpId, doj and designation of the Staff.
-> Each class has their own constructor to initialize the value of each data field.
-> Finally create MainDemoClass and create an object of each class. Print the values of all objects in the MainDemoClass. Store MainDemoClass in package mainpkg1. Create a package collegeMgt and store all the other packages under collegeMgt.

## Compilation Command from ```collegeMgt``` Directory
```
javac -d . per1/Person.java stu/Student.java emp/Employee.java emp/Faculty.java emp/Staff.java mainpkg1/MainDemoClass.java
```
Back to parent folder:
```
cd ..
```
Run the main class:
```
java collegeMgt.mainpkg1.MainDemoClass
```
## Alternative Steps if Compilation Fails [From collegeMgt's Parent Directory]

```
javac -d . collegeMgt/per1/Person.java collegeMgt/stu/Student.java collegeMgt/emp/Employee.java collegeMgt/emp/Faculty.java collegeMgt/emp/Staff.java collegeMgt/mainpkg1/MainDemoClass.java
```
Run the main class:
```
java collegeMgt.mainpkg1.MainDemoClass
```

## Question 2 (geometry)

-> Create a package named shapes. Create classes Square, Triangle, Circle under the package shapes. The classes should contain mutator, accessor, calculateArea() and calculatePerimeter() methods. 
-> Create Main Class, store it in mainpkg2 package and create an object of each class in main(). Store all the packages under package geometry.

## Compilation Command from ```geometry ``` Directory
```
javac -d . shapes/Square.java shapes/Triangle.java shapes/Circle.java mainpkg2/MainClass.java
```
go back to parent directory
```
cd ..
```
Run the main class:
```
java geometry.mainpkg2.MainClass
```
## Alternative Steps if Compilation Fails [From geometry's Parent Directory]

```
javac -d . geometry/shapes/Square.java geometry/shapes/Triangle.java geometry/shapes/Circle.java geometry/mainpkg2/MainClass.java
```
Run the main class:
```
java geometry.mainpkg2.MainClass
```

## Question 3(custDemo)

-> Design a class named Person (store in package per2)with fields for holding a person’s name, address and telephone number. Write one or more constructors and the appropriate mutator and accessor methods for the class’
fields.
-> Design another class named Customer (store in package cust), which inherits from the Person class.
-> The Customer class should have a field for a customer number and a boolean field indicating whether the customer wishes to be on a mailing list. Write one or more constructors and the appropriate mutator and accessor methods for the class’s fields.
-> Demonstrate an object of the Customer class in Main class (stores in the package mainpkg3). Store all the packages under package custDemo.

## Compilation Command from ``` custDemo ``` Directory
```
javac per2/Person.java cust/Customer.java mainpkg3/MainClass.java
```
go back to parent directory
```
cd ..
```
Run the main class:
```
java -cp . mainpkg3.MainClass
```
Or if the previous command doesn’t work, you can try running it with the fully qualified package name like this:
```
java -cp . custDemo.mainpkg3.MainClass
```
## Alternative Steps if Compilation Fails [From custDemo's Parent Directory]

```
javac custDemo/per2/Person.java custDemo/cust/Customer.java custDemo/mainpkg3/MainClass.java
```
Run the main class:
```
java custDemo.mainpkg3.MainClass
```

