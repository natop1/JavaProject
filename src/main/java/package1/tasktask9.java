package package1;

public class tasktask9 {
    public static void main(String[] args) {

        int[] num = {10, 20, 35, 48, 38, 68, 49};


        int largest = 0;
        int secLargest = 0;
        for (int i = 0; i < num.length; i++) {
            if (largest < num[i]) {
                secLargest=largest;
                    largest = num[i];
            }

            }

            System.out.println("Second largest number is " + secLargest);






        }


    }

