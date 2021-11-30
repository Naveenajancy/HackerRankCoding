package CodingPractice.datastrcture;

import java.util.Scanner;

class OneDimentionalArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] numberArray = new int[arraySize];
        for(int i = 0; i < numberArray.length; i++){
            numberArray[i] = scanner.nextInt();
        }
        for(int n : numberArray){
            System.out.println(n);

        }


    }
}
