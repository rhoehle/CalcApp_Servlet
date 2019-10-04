package com.robertleehoehle;

public class Calculator {
	
	public static float calculator(float firstNumber, float secondNumber, String operator){
        float result=0;
            switch (operator){
                case "+":
                    result=firstNumber+secondNumber;
                    break;
                case "-":
                    result =firstNumber-secondNumber;
                    break;
                case "*":
                    result=firstNumber*secondNumber;
                    break;
                case "/":
                    if (secondNumber==0){
                        throw new RuntimeException("can't not divide by zero");

                    }else {
                        result=firstNumber/secondNumber;
                    }
                    break;
                default:
                    throw new RuntimeException("Invalid operation");
            }
        return result;
    }
	
}
