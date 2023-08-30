public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        try {
            int a = calc.plus.apply(1, 2);
            int b = calc.minus.apply(1, 1);
            int c = calc.divide.apply(a, b); // деление на ноль это недопустимая арифметическая операция, т.к. 3/0 - недопустимо,
            // то java выбрасывает исключение. Возможным решением этой проблемы может быть просто замена входных даных или
            // например можно добавить проверку на неравенство нулю или поймать исключение. В условии задачи написано:
            // (Напишите реализацию, в которой предусмотрите обработку возникающей ошибки.)  Соответственно - ловим исключение!
            calc.printLn.accept(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль не возможно!");
        }
    }

}