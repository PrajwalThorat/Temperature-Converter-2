import java.util.Scanner;

public class TempTwoFunction{



    public static float celsiusToFarenheit(float c){
        float f = (float)((1.8*c)+32);
        return f;
    }

    public static float farenhietToCelsius(float f){
        float c =(float)((f-32)/1.8);
        return c;
    }

    public static void main(String[] args){
        System.out.println("Option : ");
        System.out.println("1. Celsius to Farenhiet");
        System.out.println("2. Farenhiet To Celsius");
        char ans;
        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter : ");
            int User_Input = scanner.nextInt(); 
            if(User_Input==1){
                System.out.print("Enter the Celsius : ");
                float C = scanner.nextFloat();
                float F = celsiusToFarenheit(C);
                System.out.println("Tempreture(Celsius) = "+ C + "      Tempreture(Farenhiet) = "+F);
                
            }else if(User_Input==2){
                System.out.print("Enter the Farenhiet : ");
                float F = scanner.nextFloat();
                float C = farenhietToCelsius(F);
                System.out.println("Tempreture(Farenhiet) = "+ F + "      Tempreture(Celsius) = "+C);


            }else{
                System.out.println("Invalid number!!");
            }

            System.out.println("Do you wish to continue (y/n) :");
            ans = scanner.next().charAt(0);
              
        }while((ans == 'y') || (ans == 'Y'));
        


    }
}