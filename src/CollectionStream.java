import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStream {
    List<String> strs = Arrays.asList("1234","1231","2321321");
    //创建普通流
    Stream<String> stream = strs.stream();
    //创建并行流
    Stream<String> stream1 = strs.parallelStream();
}
