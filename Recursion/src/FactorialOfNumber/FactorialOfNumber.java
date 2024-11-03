package FactorialOfNumber;

public class FactorialOfNumber {
    static int factorial(int num)
    {
        if(num==1)
            return 1;
        else return num*factorial(num-1);

    }
    public static void main(String[] args) {
        int num=9;
        System.out.println("factorial of the number is -->"+factorial(num));
    }
}
