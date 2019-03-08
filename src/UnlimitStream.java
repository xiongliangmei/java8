import java.util.Random;
import java.util.stream.Stream;

public class UnlimitStream {
    public static void main(String[] args) {
        Stream.generate(()->"number"+new Random().nextInt()).limit(100).forEach(System.out::println);
    }
}
