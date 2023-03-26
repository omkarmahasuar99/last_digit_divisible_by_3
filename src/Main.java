import java.util.Scanner;

class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Please enter a number");
            int a= sc.nextInt();
            if((a%10)%3==0)
            {
                System.out.println("The last digit of "+a+" is divisible by 3");
            }else System.out.println("The last digit of "+a+" is not divisible by 3");
        }





    }
}