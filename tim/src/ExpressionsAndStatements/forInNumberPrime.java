package ExpressionsAndStatements;

public class forInNumberPrime {
    public static void main(String[] args) {

    NumberToWords(11000);
        System.out.println(Reverse(11000));
        System.out.println(getDigitCount(1234));


    }



    public static boolean isPrime(int number) {
        if (number <= 2) {
            return (number == 2);
        }

        for (int divisor = 2; divisor < number; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }

    public static void counterOfXPrimeNumbers(int countOfNumbers) {
        int counter = 0;

        if (countOfNumbers <= 1000) {
                                for (int i = 0; i <= countOfNumbers; i++) {
                if (isPrime(i)) {
                    System.out.println(" detected prime number: " + i);
                    counter++;
                    if (counter >= 3) {
                        System.out.println("detected " + counter + " numbers");
                        break;
                    }
                }
            }
        } else System.out.println("Number is bigger than 1000");
    }

    public static void displayNumbersDivideByThreeAndFive(int maxRange) {
        int sumOfNumbers = 0;
        int countOfNumbers = 0;
        for (int i = 1; i <= maxRange; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("found number: " + i);
                sumOfNumbers += i;
                countOfNumbers++;
                if (countOfNumbers == 5) {
                    System.out.println("the numbers found add up to: " + sumOfNumbers);
                    break;

                }
            }
        }
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void showEvenNumbers(int lowerRange, int higherRange) {
        int countOfEvenNumersFound = 0;
        while (lowerRange <= higherRange) {
            if (isEven(lowerRange)) {
                System.out.println(lowerRange);
                countOfEvenNumersFound++;
                if (countOfEvenNumersFound == 5) {
                    System.out.println("found " + countOfEvenNumersFound + " even numbers");
                    break;
                }
            }
            lowerRange++;
        }
    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        } else if (number < 9){
            return number;
        }else{
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        }
    }

    public static boolean isEvenn(int number){
        if(number % 2 == 0){
            return true;
        }else return false;
    }

    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }else{
            int sum = 0;
            while(number > 0){
                if(isEvenn(number % 10)){
                    sum += number % 10;
                }
                number /= 10;
            }
            return sum;
        }

    }


        public static boolean hasSharedDigit(int lowerRange,int upperRange){
            if( lowerRange > upperRange && lowerRange >= 10 && upperRange <= 99){
                return false;
            }else{
                int currentDigitOfFirstNumber = 0;
                int currentDigitOfSecondNumber = 0;

                while (lowerRange < upperRange){
                    currentDigitOfFirstNumber = lowerRange % 10;
                    lowerRange /= 10;
                    while (lowerRange < upperRange){
                        currentDigitOfSecondNumber = upperRange % 10;
                        upperRange /= 10;
                        if(currentDigitOfFirstNumber == currentDigitOfSecondNumber){
                            return true;
                        }
                    }
                }
            }return false;
        }

    public static int getGreatestCommonDivisor(int first, int second){
        if(first >= 10 && second >= 10){
            int currentDividerOfFirst = 1;
            int currentDividerOfSecond = 1;
            int greatestDiviser = 0;
            while(currentDividerOfFirst <= first){
                currentDividerOfSecond = 1;
                while(currentDividerOfSecond <= second){
                    if(currentDividerOfFirst == currentDividerOfFirst && first % currentDividerOfFirst == 0 && second % currentDividerOfSecond == 0){
                        greatestDiviser = currentDividerOfFirst;
                    }
                    currentDividerOfSecond++;
                }
                currentDividerOfFirst++;
            }
            return greatestDiviser;
        }else return -1;
    }


        public static void NumberToWords(int number){
            int originCount = getDigitCount(number);
            number = Reverse(number);
            int countAfterReverse = getDigitCount(number);
            if(number > 0){
                while (number > 0){
                    String currentNumber = null;
                    switch (number % 10){
                        case 0 -> currentNumber = "ZERO";
                        case 1 -> currentNumber = "ONE";
                        case 2 -> currentNumber = "TWO";
                        case 3 -> currentNumber = "THREE";
                        case 4 ->  currentNumber = "FOUR";
                        case 5 ->  currentNumber =  "FIVE";
                        case 6 ->  currentNumber = "SIX";
                        case 7 ->  currentNumber = "SEVEN";
                        case 8 ->  currentNumber = "EIGHT";
                        case 9 ->  currentNumber = "NINE";
                    }
                    System.out.println(currentNumber);
                    number = number / 10;
                }
                while(countAfterReverse < originCount){
                    System.out.println("ZERO");
                    countAfterReverse++;
                }
            }else{
                System.out.println("Invalid Value");
            }
        }


        public static int Reverse(int number){
            int reversedNumber = 0;
            while(number != 0){
                reversedNumber = reversedNumber * 10 + (number % 10);
                number /= 10;
            }
            return reversedNumber;
        }

        public static int getDigitCount(int number) {
        int countOfDigits = 0;
        while (number > 0) {
                countOfDigits++;
                number /= 10;
            }
        return countOfDigits;
        }


    public static boolean canPack(int bigCount, int smallCount, int goal) {
        int kilosInBigPacks = 5 * bigCount;
        int kilosInSmallPacks = smallCount;
        int kilosInStorage = kilosInBigPacks + kilosInSmallPacks;
        int enoughLeft = goal;
        if (bigCount < 0 || smallCount < 0 || goal < 0 || kilosInStorage < goal) {
            return false;
        }
        while (enoughLeft > 0) {
            if (enoughLeft >= 5 && bigCount > 0) {
                bigCount--;
                enoughLeft -= 5;
                continue;
            }
            if (enoughLeft < 5 && smallCount > 0) {
                smallCount--;
                enoughLeft--;
            }else{
                break;
            }
        }
        if (enoughLeft == 0) {
            return true;
        }else return false;
    }


    public static int getLargestPrime(int number){
        int theBiggestPrimeDivider = 2;

        int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157, 163, 167, 173, 179, 181, 191, 193, 197, 199, 211, 223, 227, 229, 233, 239, 241, 251, 257, 263, 269, 271, 277, 281, 283, 293, 307, 311, 313, 317, 331, 337, 347, 349, 353, 359, 367, 373, 379, 383, 389, 397, 401, 409, 419, 421, 431, 433, 439, 443, 449, 457, 461, 463, 467, 479, 487, 491, 499, 503, 509, 521, 523, 541, 547, 557, 563, 569, 571, 577, 587, 593, 599, 601, 607, 613, 617, 619, 631, 641, 643, 647, 653, 659, 661, 673, 677, 683, 691, 701, 709, 719, 727, 733, 739, 743, 751, 757, 761, 769, 773, 787, 797, 809, 811, 821, 823, 827, 829, 839, 853, 857, 859, 863, 877, 881, 883, 887, 907, 911, 919, 929, 937, 941, 947, 953, 967, 971, 977, 983, 991, 997};

        for(int i = 0; i <= number; i++){
            if(number % primeNumbers[i] == 0){
                theBiggestPrimeDivider = primeNumbers[i];
            }
        }
        if(theBiggestPrimeDivider == 1 || number <= 0){
            return -1;
        }else return theBiggestPrimeDivider;
    }

    public static int getLargestPrimeWithoutArray(int number) {
        if (number < 2) {
            return -1;
        }
         for(int i = number / 2; i >= 2; i--)
            if(number % i == 0) {
                number = i;
            }
        return number;
    }
}
