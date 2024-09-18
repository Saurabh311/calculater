Calculator API
A simple calculator API built using Java 21 and Spring Boot that supports basic arithmetic operations. This project demonstrates the use of REST endpoints for performing and storing calculations. Each operation is accessed via dedicated endpoints, and calculation history is stored in memory and returned in JSON format.
Features
Supports the four basic operations:
Addition (+)
Subtraction (-)
Multiplication (*)
Division (/)
Handles division by zero with appropriate error response.
Persist calculations in memory.
Fetch all previously made calculations in JSON format.
Unit tested using JUnit 5.
Technologies Used
Java 21
Spring Boot 
Maven (for dependency management)
JUnit 5 (for unit testing)
Endpoints
The API exposes the following endpoints:
Arithmetic Operations
Each arithmetic operation returns a plain text result.
Addition
Method: GET
URL: /api/calculate/add
Parameters: number1, number2 (double)
Example: /api/calculate/add? number1=5& number2=10
Response: 15
Subtraction
Method: GET
URL: /api/v1/calculate/subtract
Parameters: number1, number2 (double)
Example: /api/calculate/subtract? number1=10& number2=3
Response: 7
Multiplication
Method: GET
URL: /api/calculate/multiply
Parameters: number1, number2 (double)
Example: /api/calculate/multiply?number1=7& number26
Response: 42
Division
Method: GET
URL: /api/v1/calculate/divide
Parameters: number1, number2 (double)
Example: /api/calculate/divide? number1=20& number2=5
Response: 4.0
Note: Division by zero will return an error message in plain text:
Text :NaN

History of Calculations
The history of all calculations is returned in JSON format.
Get Calculation History
Method: GET
URL: /api/calculate/history
Response (Example):
json
Copy code
[
  {
    "operation": "add",
    "a": 5,
    "b": 10,
    "result": 15
  },
  {
    "operation": "subtract",
    "a": 10,
    "b": 3,
    "result": 7
  },
  {
    "operation": "multiply",
    "a": 7,
    "b": 6,
    "result": 42
  }
]