package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        if(cathetusLength != 0)
        {
            for (int i = 1; i < cathetusLength+1; i++)
            {
                    for (int k = 0; k < cathetusLength-i; k++) System.out.print(" ");
                    for (int l = i; l > 0; l--) System.out.print("*");

                System.out.println();
            }
        }

    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
