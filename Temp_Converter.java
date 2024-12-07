import java.sql.SQLOutput;
import java.util.Scanner;

public class Temp_Converter {
    public static void main(String [] args){

        //Scanner object to take input from user
        Scanner input =new Scanner(System.in);

        //Print statements to guide user into choosing an option
        System.out.println();
        System.out.println("Please select an option: \n"+
                "1.Convert from Celsius to Fahrenheit \n" +
                "2.Convert from Fahrenheit to Celsius" );

        //int variable to store the choice of the user
        int userChoice = input.nextInt();

        //variable to  store the output before concatenation with string
        double output=0;

       if(userChoice==1){
           System.out.println("Please input a Celsius temperature between 0 and 100: ");

           //a double variable to  store the Celsius temperature input from the user
           double celsiusTemp=input.nextDouble();

           //Making sure user inputs right value
           if (celsiusTemp>=0 && celsiusTemp<=100){
               output=celsiusToFahrenheit(celsiusTemp);
               System.out.println(celsiusTemp + "°C in Fahrenheit is " + output+"F");
           }
           else{
               System.out.println("This number isn't in the range 0 to 100 obviously");
           }

       }else if (userChoice==2){
           System.out.println("Please input a Fahrenheit temperature between -38 to 202.4: ");

           //Variable to store the Fahrenheit temperature from the  user
           double fahrenheitTemp=input.nextDouble();

           if  (fahrenheitTemp>=-38 && fahrenheitTemp<=202.4 ){
               output=fahrenheitToCelsius(fahrenheitTemp);
               System.out.println(fahrenheitTemp + "F in Celsius is "+ output+ "°C");
           }
           else{
               System.out.println("We both know that number isn't in the range -38 to 202.4");
           }
       }
       else{
           System.out.println("Oops you entered an invalid choice");
       }
       //closing Scanner method to prevent memory leakage
       input.close();


    }

    //Method to convert Celsius to Fahrenheit
    static double celsiusToFahrenheit(double celsius){
        return (celsius*9/5)+32;
    }
    //method to convert Celsius to Fahrenheit
    static double fahrenheitToCelsius(double fahrenheit){
        return (fahrenheit-32)*5/9;
    }
}
