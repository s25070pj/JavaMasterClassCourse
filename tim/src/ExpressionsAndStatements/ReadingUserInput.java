package ExpressionsAndStatements;

import java.util.Scanner;

public class ReadingUserInput {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void sumNumbers() {
        Scanner scanner = new Scanner(System.in);
        int currentNumber = 1;
        int sumOfNumbers = 0;
        do {
            System.out.println("Enter #" + currentNumber + " number:");
            String number = scanner.nextLine();

            try {
                sumOfNumbers += Integer.parseInt(number);
            } catch (NumberFormatException notInt) {
                System.out.println("Characters not allowed!!! Try again.");
                continue;
            }
            currentNumber++;
        } while (currentNumber <= 5);
        System.out.println(sumOfNumbers);
    }

    public static void minMaxValue() {
        Scanner scanner = new Scanner(System.in);
        int currentIteration = 1;
        int minValue = Integer.MAX_VALUE;
        int maxValue = Integer.MIN_VALUE;
        do {
            System.out.println("Enter number #" + currentIteration + ":");
            String currentValue = scanner.nextLine();
            try {
                int currentNumberValue = Integer.parseInt(currentValue);
                if (currentNumberValue < minValue) {
                    minValue = currentNumberValue;
                }
                if (currentNumberValue > maxValue) {
                    maxValue = currentNumberValue;
                }
            } catch (NumberFormatException e) {
                System.out.println("You printed not a number Value");
                if (currentIteration == 1) {
                    continue;
                } else {
                    System.out.println("The lowest entered value is: " + minValue + " and the biggest value is: " + maxValue);
                    break;
                }
            }
            currentIteration++;
        } while (true);
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int average = 0;
        int currentNumber = 1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the number #" + currentNumber + ":");
            String enteredValue = scanner.nextLine();
            try {
                Integer.parseInt(enteredValue);
                sum += Integer.parseInt(enteredValue);
                average = sum / currentNumber;
                currentNumber++;
            } catch (NumberFormatException e) {
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }

        }
    }

        public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }
            double areaFromBobsBuckets = extraBuckets * areaPerBucket; // zwraca powiezchnie zamalowana wiadrami boba
            double areaToPrint = width * height;
            double areaToPrintAfterPrintingFromBobsBuckets = areaToPrint - areaFromBobsBuckets;
            double neededBucketsAfterAddingBobsBuckets = areaToPrintAfterPrintingFromBobsBuckets / areaPerBucket;

                return (int) (neededBucketsAfterAddingBobsBuckets + 1);

        }

        public static int getBucketCount(double width, double height, double areaPerBucket) {
            if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
                return -1;
            }
            double areaToPrint = width * height;
            double neededBucketsAfterAddingBobsBuckets = areaToPrint / areaPerBucket;
                return (int) (neededBucketsAfterAddingBobsBuckets + 1);
        }

        public static int getBucketCount(double area, double areaPerBucket) {
            if (area <= 0 || areaPerBucket <= 0) {
                return -1;
            }
            double neededBucketsAfterAddingBobsBuckets = area / areaPerBucket;
                return (int) (neededBucketsAfterAddingBobsBuckets + 1);
        }
    }
