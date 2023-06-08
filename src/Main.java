import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -7.0};
        double sum = 0;
        int count = 0;
        boolean foundNegative = false;

        for (double number : numbers) {
            if (number < 0) {
                foundNegative = true;
            } else if (foundNegative) {
                sum += number;
                count++;
            }
        }

        double average = sum / count;
        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);

        // Сортировка массива по возрастанию
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[i]) {
                    double temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            System.out.println(Arrays.toString(numbers));
        }
    }
}
