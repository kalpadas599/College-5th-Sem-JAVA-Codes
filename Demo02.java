

class Calculator //created class
{
    int a;//variable

    public int add(int n1, int n2) //method
    {
        //System.out.println("in add");
        int r = n1 + n2;
        return r;
    }
}

public class Demo02
{
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 5;

        Calculator calc = new Calculator();     //Constructor
        int result = calc.add(num1,num2);

        System.out.println(result);
        /* 
        int result = num1+num2;
        System.out.println(result); */
    }
}