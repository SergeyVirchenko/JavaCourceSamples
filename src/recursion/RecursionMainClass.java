package recursion;

public class RecursionMainClass {

    public static void main(String[] args) {
        countdown(10);
        countdownRec(10);
        fibonacci(100);
        System.out.println(fibonacciRecursion(20));
    }

    /**
     * пример функции, реализованной с помощью цикла
     */

    static void countdown(int n){
        for(; n > 0; n--){
            System.out.println("Start in " + n);
        }
    }

    /**
     * с помощью рекурсии
     * такой тип вызова нужно будет использовать для решения задачи про шоколадные конфеты
     */

    static void countdownRec(int n){
        if(n < 0) return;
        System.out.println("Start in " + n);
        countdownRec(n - 1);
    }

    /**
     * Функция вычисления последовательности Фибоначчи: 0, 1, 1, 2, 3, 5, 8, 13...
     * Реализованна с помощью цикла
     *
     * @param number
     */
    static void fibonacci(int number) {
        long fibo1 = 1 ;
        long fibo2 = 1;
        long fibonacci;
        for (int i = 3; i <= number; i++) {
            fibonacci = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibonacci;
            if(fibonacci < 0){
                System.out.println("We exceed type long capacity on iteration n = " + i);
                return;
            } else {
                System.out.println(fibonacci + " || " + (Long.MAX_VALUE - fibonacci) + " left too MAX_VALUE");
            }
        }
    }

    /**
     * Функция вычисления последовательности Фибоначчи: 0, 1, 1, 2, 3, 5, 8, 13...
     * Реализованна с помощью рекурсии. Сильно пока не заморачивайтесь, это сделанно чтобы показать как функция вызывает сама себя
     *
     * Не советую запускать с значением больше 20, работает очень долго
     *
     * @param number
     */
    static long fibonacciRecursion(int number) {
        if (number == 1 || number == 2) {
            return 1;
        }

        return fibonacciRecursion(number - 1) + fibonacciRecursion(number - 2);
    }
}
