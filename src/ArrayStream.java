
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayStream {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,34,5};
        IntStream intStream = Arrays.stream(arr);
        intStream.forEach(System.out::println);

        Stream<Integer> stream2 = Stream.of(1,2,3,4);
        stream2.forEach(System.out::println);

        //map 操作 把一种类型 的流转换为另外一种类型的流,将String 数组中的字母转为大写
        String[] arrs = new String[]{"yes","YES","no","NO"};
        Arrays.stream(arrs).map(x->x.toLowerCase()).forEach(System.out::println);

        //过滤操作
        Arrays.stream(arr).filter(x->x>3).forEach(System.out::println);


        //flapMap拆解流
        String[] arr1 = {"a","b","c","d"};
        String[] arr2 = {"e","f","c","d"};
        String[] arr3 = {"h","j","c","d"};

        Stream.of(arr1,arr2,arr3).flatMap(Arrays::stream).forEach(System.out::println);


        //对流进行排序
        String[] arrss = {"abc","a","bc","abcd"};
        Arrays.stream(arrss).sorted((x,y)->{
            if (x.length() > y.length()){
                return 1;
            }else if (x.length() <y.length()){
                return -1;
            }else {
                return 0;
            }
        }).forEach(System.out::println);

        //第二种方式
        Arrays.stream(arrss).sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println("=============================================================================");
      //倒序
      Arrays.stream(arrss).sorted(Comparator.comparing(String::length).reversed()).forEach(System.out::println);
      System.out.println("===============================================================================");
      Arrays.stream(arrss).sorted(Comparator.reverseOrder()).forEach(System.out::println);
      System.out.println("===============================================================================");
      Arrays.stream(arrss).sorted(Comparator.naturalOrder()).forEach(System.out::println);
      System.out.println("================================================================================");


      //提取流和组合流
        String[] arrX =arr1;
        String[] aaxY = arr2;
        String[] arrZ = arr3;

     Stream.iterate(1,x->x+1).skip(1).limit(5).forEach(System.out::println);


     Stream<String> stream1 = Stream.of(arr1);
     Stream<String> stream3 = Stream.of(arr2);
     Stream.concat(stream1,stream3).distinct().forEach(System.out::println);

    }
}
