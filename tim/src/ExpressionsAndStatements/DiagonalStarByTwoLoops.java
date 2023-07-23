package ExpressionsAndStatements;

public class DiagonalStarByTwoLoops {

    public static void main(String[] args) {
        printSquareStar(8);
    }
    public static void printSquareStar(int number){
        if(number < 5){
            System.out.println("Invalid Value");
        }

        for(int row = 0; row < number; row++){
            for(int column = 0; column < number; column++){
                if (row == 0 || column == 0 || row == column || row == number - 1 || column == number - 1 || column == number - 1 - row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
