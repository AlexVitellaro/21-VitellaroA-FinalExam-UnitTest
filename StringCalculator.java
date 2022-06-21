package main.java;

public class StringCalculator {
	
   public static int add(final String numbers) {
	   
	   //throw exception for invalid input
   		if(Integer.parseInt(numbers) < 0){
   		throw new IllegalArgumentException("negatives are now allowed");
   		}
	   
   		int returnValue = 0;
   		String[] numbersArray = numbers.split(",|\n"); 
      
   		for (String number : numbersArray) {
   			
   			if (Integer.parseInt(number.trim()) > 1000) {
   				returnValue += 0;
   				continue;
   			}
    	  
   			if (!number.trim().isEmpty()) {
   				returnValue += Integer.parseInt(number.trim());
   			}
   		}
   		return returnValue;
   }
}