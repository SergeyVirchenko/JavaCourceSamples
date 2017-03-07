package chocolate;

/**
 * Ничего здесь не меняйте, этот класс проверяет ваше решение, которое нужно написать в {@link ChocolateSolve}
 */
public class ChocolateSolutionTest {

    private static final int[] small = {4, 4, 4, 6, 4, 4, 5, 9, 3, 1, 1, 1, 6, 6, 6, 6, 6, 6, 6, 60, 1000, 7, 7, 7};
    private static final int[] big = {1, 1, 1, 2, 1, 1, 4, 3, 1, 2, 2, 2, 1, 1, 1, 1, 2, 2, 2, 100, 1000000, 1, 1, 2};
    private static final int[] goal = {9, 10, 7, 7, 5, 4, 9, 18, 9, 7, 6, 5, 10, 11, 12, 13, 10, 11, 12, 550, 5000006, 12, 13, 13};
    private static final int[] result = {4, -1, 2, 2, 0, 4, 4, 3, -1, -1, 1, 0, 5, 6, -1, -1, 0, 1, 2, 50, 6, 7, -1, 3};

    public interface IChocolate {
        int makeChocolate(int small, int big, int goal);
    }

    public void checkSolution(IChocolate solution) {
        int funcResult;
        p("----------------------------------------");
        for (int i = 0; i < 24; i++) {
            funcResult = solution.makeChocolate(small[i], big[i], goal[i]);
            p("makeChocolate( " + small[i] + ", " + big[i] + ", " + goal[i] + ") -> " + result[i] + ", run = " + funcResult + ", " + (funcResult == result[i] ? "OK" : "WRONG"));
            p("----------------------------------------");
        }
    }

    private void p(String s) {
        System.out.println(s);
    }
}
