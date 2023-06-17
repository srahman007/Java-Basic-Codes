import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer number: ");
        int number = input.nextInt();
        boolean flag = false;

        for (int i = 2; i< number; i++){
            if (number % i == 0){
                flag = true;
            }
        }

        if (flag == true){
            System.out.println("This is not a prime number.");
        }
        else{
            System.out.println("This is a prime number.");
        }
    }
}
