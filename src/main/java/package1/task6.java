package package1;

public class task6 {
    public static void main(String[] args) {

       int num=47;
        boolean isPrime=true;
        if (num == 0 || num == 1) {

            isPrime=false;
        } else {
            for (int i = 2; i <= num / 2;i++) {
                if (num % 2 == 0) {
                 isPrime = false;

                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }





















    }

