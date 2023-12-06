package package1;

public class arraytask4 {
    public static void main(String[] args) {

        int[][] numbers = {
                {6, 9, 12, 45},
                {27, 30, 35, 60},
                {26, 54, 38, 41}
        };
        int evenSum= 0;
        int oddSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] % 2 == 0) {
                    evenSum=evenSum+ numbers[i][j];
                } else {
                    oddSum=oddSum+ numbers[i][j];
                }
            }
        }

        System.out.println("The sum of even numbers is " + evenSum);
        System.out.println("The sum of odd numbers is " + oddSum);



    }


}



































