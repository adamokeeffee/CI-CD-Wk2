package ie.atu.week2lab;

public class Calculator {

     public double calculate(double num1, double num2, String operation){
         switch (operation){
             case "add":
                 return num1 + num2;
             case "subtract":
                 return num1 - num2;
             case "multiply":
                 return num1 * num2;
             case "divide":
                if(num2 == 0){
                    throw new
                            IllegalArgumentException("Cannot divide by zero");
                }
                return num1 / num2;
                default:
                    throw new
                        IllegalArgumentException("Unknown operation");
         }
     }
}
