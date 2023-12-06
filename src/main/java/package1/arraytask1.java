package package1;

public class arraytask1 {

    public static void main(String[] args) {
        int [] temp={45,35,48,68,55,42,70};

        int highestT=temp[0];
        int lowestT=temp[0];
        for(int i=1;i<temp.length;i++) {
            if (temp[i] > highestT) {
                highestT = temp[i];
            }
            if (temp[i] < lowestT) {
                lowestT = temp[i];
            }
        }

            System.out.println("highest is " + highestT);
            System.out.println("lowest is " + lowestT);





















            }










        }
















