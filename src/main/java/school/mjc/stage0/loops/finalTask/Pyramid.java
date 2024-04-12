package school.mjc.stage0.loops.finalTask;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        for (int i = 1; i <= cathetusLength; i++)
        {
            for (int j = 0; j < cathetusLength-i;j++) System.out.print(" ");
            for (int k = i; k >0; k-- ) System.out.print(k);
            for (int k = 2; k <=i; k++ ) System.out.print(k);
            System.out.println();
        }

    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }
}
