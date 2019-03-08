import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class aggStream {
    public static void main(String[] args) {
        String[] arr = new String[]{"b","ab","abc","abcde"};
        Stream.of(arr).max(Comparator.comparing(String::length)).ifPresent(System.out::println);
        Stream.of(arr).min(Comparator.comparing(String::length)).ifPresent(System.out::println);

        //计算数量
        long count = Stream.of(arr).count();
        System.out.println(count);

        //查找第一个
        String str = Stream.of(arr).parallel().filter(x->x.length()>3).findFirst().orElse("noghing");
        System.out.println(str);

        //findAny
        Optional<String> optional = Stream.of(arr).parallel().filter(x->x.length()>3).findAny();
        optional.ifPresent(System.out::println);


        //是否有匹配元素
        Boolean aBoolean = Stream.of(arr).anyMatch(x->x.startsWith("a"));
        System.out.println(aBoolean);

        //是否
        Optional<Integer> optional1 = Stream.of(1,2,3).filter(x->x>1).reduce((x,y)->x+y);
        System.out.println(optional.get());


        List<String> list = new ArrayList<String>(){
            {
                add("user1");
                add("user2");
            }
        };
        Optional<String> opt = Optional.of("and with u");
        opt.ifPresent(list::add);
        list.forEach(System.out::println);

        Integer[] arrss = new Integer[]{4,5,6,7,8,9};
        Integer result = Stream.of(arrss).filter(x->x>9).max(Comparator.naturalOrder()).orElse(-1);
        System.out.println(result);
    }
}
