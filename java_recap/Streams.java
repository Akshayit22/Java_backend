import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

public class Streams{

        public static void print(int x){
                System.out.print(x + " ");
        }


        public static void main(String args[]){
                System.out.println("Java Streams ....");

                List<Integer> list = Arrays.asList(1,2,4,5,7,43,93,2,5,2,467,78,3432,32);

                List<Integer> filteredList = list.stream()
                                                .filter(x-> x%2 == 0)
                                                .peek(x->System.out.print(x +" "))
                                                .map(x -> x*2)
                                                .peek(x->System.out.print(x +" "))
                                                .distinct()
                                                .sorted((a,b)-> (b-a))
                                                .limit(5)
                                                .skip(1)
                                                .collect(Collectors.toList());
                System.out.println(filteredList);
        }

}