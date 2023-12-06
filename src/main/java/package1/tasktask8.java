package package1;

public class tasktask8 {
    public static void main(String[] args) {

        int[] number={5,8,20,34,50,56,43,24};

        int maxNumber=number[0];
        int minNumber=number[0];
        for(int i=0;i<number.length;i++) {
            if (number[i] > maxNumber) {
                maxNumber = number[i];
            }

            if (number[i] < minNumber) {
                minNumber = number[i];
            }


        }
            System.out.println("Maximum number is " + maxNumber);
            System.out.println("Minimum number is " + minNumber);

















    }
}
