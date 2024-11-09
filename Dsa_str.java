import java.util.Scanner;
class Calculator //created class
{
   // int a;//variable

    public int add(int n1, int n2) //method
    {
        //System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

public class Dsa_str
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        Calculator calc = new Calculator();     //Constructor
        int result = calc.add(num1,num2);

        System.out.println(result);
        /* 
        int result = num1+num2;
        System.out.println(result); */
    }
}