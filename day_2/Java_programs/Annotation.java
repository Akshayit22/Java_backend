import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@interface MyAnnotation{
    int value();
}

@MyAnnotation(value=10)
class Sample{
    @Deprecated
    void method(){
        System.out.println("Sample.");
    }
}

public class Annotation extends Sample{
    @Override
    void method(){
        System.out.println("Annotation.");
    }
    public static void main(String[] args) {
        Sample s = new Annotation();
        s.method();
    }
}