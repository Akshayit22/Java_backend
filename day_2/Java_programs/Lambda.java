import java.util.ArrayList;
import java.util.stream.Stream;

@FunctionalInterface
interface Drawable{
    public void draw();
}

@FunctionalInterface
interface Addition{
    public int Add(int a,int b);
}

class LambdaForIteration{
    ArrayList<String> l = new ArrayList<String>();
    LambdaForIteration(){
        l.add("Ankit");l.add("Aakash");l.add("amar");l.add("akshay");
    }
    void PrintList(){
        l.forEach((n)->System.out.println(n));

        Stream<String> filtered = l.stream().filter(s-> s == "akshay" || s == "amar");
        filtered.forEach(s -> System.out.println(s));
    }
}


public class Lambda {
    public static void main(String[] args) {
        int w = 10;

        // without lambda
        // Drawable d1 = new Drawable() {
        //     public void draw(){
        //         System.out.println("Drawing without Lambda " + w  );
        //     }
        // };
        // d1.draw();

        // with lambda
        Drawable d2 = () ->{
            System.out.println("Drawing with Lambda " + w );
        };
        d2.draw();

        Addition ad1 = (a,b) -> (a+b);

        Addition ad2 = (int a,int b) ->{
            return (a+b);
        };
        System.out.println(ad1.Add(10, 15));
        System.out.println(ad2.Add(100, 105));

        LambdaForIteration obj = new LambdaForIteration();
        obj.PrintList();
    }
}
