package project2;

import java.util.Arrays;

public class task5 {

    public static boolean isAnagram(String one, String two) {

        char[] arr1 = one.toCharArray();
        char[] arr2 = two.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("listen", "silent"));
    }

  }




