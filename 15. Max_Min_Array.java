public class MaxMinArray {
    public static void main(String[] args) {
        int[] numbers = {34, 12, 67, 45, 89, 23};

        int max = numbers[0];
        int min = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum number: " + max);
        System.out.println("Minimum number: " + min);
    }
}
