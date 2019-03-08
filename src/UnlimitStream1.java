import java.util.stream.Stream;

public class UnlimitStream1 {
    public static void main(String[] args) {
        Stream.iterate(0,x->x+1).limit(10).forEach(System.out::println); //从0 开始每次 加1
        Stream.iterate(0,x->x+2).limit(10).forEach(System.out::println); //从0开始每次 加2

    }
}
