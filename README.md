# SOFE3290_Lab2_CRN75766_100792709
Binary Calculator Web Application and API Services with Spring Boot & Maven

## 1. Overview
This Lab 2 was to complete the binary calculator I did last time in Lab 1, into an external web browser/site using Spring Boot. The main tasks were to add 3 more operations to the Binary class, update the controllers so they can access them, and write around 6 or maybe more test cases for both the binary web application and the binary API service.   
I added multiplication (*), bitwise AND (&), and bitwise OR (|) operations for the web application and API service. I built and made this project/lab using Maven and the application was run using the Spring Boot runner. The final build and test case summary are in this report along with their target class/function, purpose and screenshot of the test summary from a maven test.

---

## 2. Implementation Summary

### 2.1 Binary.java

Contains code that initialises inputs from user in calculator to '0' or '1', and turn invalid inputs into '0'. 
Contains the operations for the addition, multiplication, AND, & OR methods with operands 'a' and 'b'.
  - *Binary.add(Binary a, Binary b)*
  - *Binary.multiply(Binary a, Binary b)*
  - *Binary.and(Binary a, Binary b)*
  - *Binary.or(Binary a, Binary b)*

### 2.2 Web/Binary Controller
Show the calculator view for the user using *GET /* methods for each operation.
*POST /* controls the calculator functions as they correspond to the right one (add [+], multiply [*]) and completes the operations and then gives the result to the external 'localhost'

### 2.3 API/BinaryAPI Controller

The *String* endpoints and methods each takes in operands *a* and *b* and computes their operation (+, *, &, |) and returns results as a string.  
  
The *JSON* endpoints and methods each takes in operands *a* and *b* and computes their operation (+, *, &, |) to build a binary object and returns results as a JSON oject.
Everything is controlled as a 'BinaryAPIresult'.

This section is about the lab requirements of implmenting the operators *(+, *, &, |)* in both the binary web application and the binary API service.

---

## 3. Summary of the 6 tests, & their target and purposes

### Web Application Test Cases
1. *multiply(Binary a, Binary b):* purpose is to check that the multiplication operation/testcase work properly in the calculator and the correct value is returned. The target is binaryController.result()
2. *and(Binary a, Binary b):* purpose is to check that the multiplication operation/testcase work properly in the calculator and the correct value is returned. The target is binaryController.result()
3. *or(Binary a, Binary b):* purpose is to check that the multiplication operation/testcase work properly in the calculator and the correct value is returned. The target is binaryController.result()

### API Service Test Cases
3. *@Test public void mul():* purpose is to check that the API service returns the correct multiplication result. The target is *GET /mul*
4. *@Test public void andOp():* purpose is to check that the API service returns the correct AND result. The target is *GET /and*
5. *@Test public void orOp():* purpose is to check that the API service returns the correct OR result. The target is *GET /or*

---

## 4. Maven Test Summary

All tests were run in either Git Bash or VSCode Terminal with:
*mvn clean test* &  
*mvn spring-boot:run*

---  

## Video Link (Youtube)  

https://www.youtube.com/watch?v=84oKLIeQyyc
