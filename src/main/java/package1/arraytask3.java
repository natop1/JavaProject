package package1;

public class arraytask3 {
    public static void main(String[] args) {

        int[][] numbers = {
                {1, 20, 24, 27, 44},
                {25, 36, 45, 68, 84},
                {50, 53, 26, 17, 80},
        };

        for (int a = 0; a < numbers.length; a++) {
            for (int b = 0; b < numbers[a].length; b++) {
                if (numbers[a][b] % 2 == 0) {


                    System.out.print(numbers[a][b] + " ");
                }
            }

            System.out.println();


        }


    }


    }

