package ExpressionsAndStatements;

public class switchPrintDayOfweek {
    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            printDayOfWeek(i);
        }
    }


        public static void printDayOfWeek ( int day){
            String dayOfWeek = switch (day) {
                case 0 -> "Sunday";
                case 1 -> "Monday";
                case 2 -> "Tuesday";
                case 3 -> "Wednesday";
                case 4 -> "Thursday";
                case 5 -> "Friday";
                case 6 -> "Saturday";
                default -> "Invalid Day";
            };

            System.out.println(day + " stands for " + dayOfWeek);
        }



        public static void printNumberInWord(int number){
            String printNum = switch (number){
                case 0 -> "ZERO";
                case 1 -> "ONE";
                case 2 -> "TWO";
                case 3 -> "THREE";
                case 4 -> "FOUR";
                case 5 -> "FIVE";
                case 6 -> "SIX";
                case 7 -> "SEVEN";
                case 8 -> "EIGHT";
                case 9 -> "NINE";
                default -> "OTHER";
            };
        }

        public static boolean isLeapYear (int year){
            if (year >=1 && year <= 9999){
                if ((year%4==0 && year %100!=0) || year%400==0){
                    return true;
                }else return false;
            }else return false;
        }

        public static int getDaysInMonth(int month, int year){
            if((month > 1 && month < 12) || (year > 1 && year < 9999)){
                    int numberOfDays;
                    switch (month){
                        case 1,3,5,7,8,10,12 -> numberOfDays = 31;
                        case 2 -> {
                            if (isLeapYear(year)) {
                                numberOfDays = 29;
                            }else{
                                numberOfDays = 28;
                            }
                        }
                        case 4,6,9,11 -> numberOfDays = 30;
                        default -> numberOfDays = -1;
                    };
                    return numberOfDays;
            }else return -1;
        }



        public static boolean isOdd(int number){
            if(number > 0){
                if ( number % 2 == 0){
                    return true;
                }return false;

            } else return false;
        }

        public static int sumOdd(int start, int end){
            int sum = 0;
            if(end>start && start > 0 && end > 0){

                for(int i = start; i <= end; i++){
                    sum+=i;
                }

            } else return -1;
            return sum;
        }





}
