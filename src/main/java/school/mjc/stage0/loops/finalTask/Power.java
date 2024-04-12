package school.mjc.stage0.loops.finalTask;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = numberToPrint;
        if (power == 0 && numberToPrint !=0) System.out.print(1);
        else if (numberToPrint == 0) System.out.print(0);
        else{ for (int i = 1; i < power; i++)
                result *= numberToPrint;
                System.out.println(result);
            }
    }

    public static void main(String[] args) {
        new Power().printPower(10, 3);
    }
}
