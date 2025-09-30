package ie.atu.week2lab;

public class Calculator {

     public double calculate(double num1, double num2, String operation){
         // switch operation to switch cases from add, subtract, multiply and divide
         switch (operation){
             case "add":
                 return num1 + num2;
             case "subtract":
                 return num1 - num2;
             case "multiply":
                 return num1 * num2;
             case "divide":
                if(num2 == 0){
                    throw new                // if divided by 0 error message occurs not allowing division
                            IllegalArgumentException("Cannot divide by zero");
                }
                return num1 / num2;
                default:                // if unknown operation is put in shows this message
                    throw new
                        IllegalArgumentException("Unknown operation");
         }
     }
}
