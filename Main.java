public class Main {
    public static void main(String[] args) {

        double[] numbers = {1.5, 2.3, -4.2, 3.7, 5.1, 7.8, -1.1, 2.2, 4.4, -3.3, 6.6, -5.5, 1.1, 9.9, -2.2};

        double sum = 0;
        int count = 0;

        boolean foundFirstNegative = false;

        for (double number : numbers) {
            if (number < 0) {
                foundFirstNegative = true;
            } else if (foundFirstNegative && number > 0) {

                sum += number;
                count++;
            }
        }

        if (count > 0) {
            double average = sum / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("Нет положительных чисел после первого отрицательного.");
        }
    }
}
