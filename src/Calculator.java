import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;
    BinaryOperator<Integer> plus = (x, y) -> x + y;
    BinaryOperator<Integer> minus = (x, y) -> x - y;
    BinaryOperator<Integer> multiply = (x, y) -> x * y;
    Predicate<Integer> isPosityve = y -> y > 0;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> ads = y -> y > 0 ? y : 0;
    
//    BinaryOperator<Integer> divide = (x, y) -> (y > 0) ? x / y : 0; // Первое решение - использование только тернарного оператора (Работает)
    BinaryOperator<Integer> divide = (x, y) -> (isPosityve.test(y)) ? x / y : 0; // Второе решение - включает в тернарный оператор интервейс Predicate (Работает)
    Consumer<Integer> printLn = System.out::println;
}
