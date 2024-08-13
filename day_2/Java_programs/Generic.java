/*
 * T - Type
 * E - Element
 * K - key
 * V - Value
 */
class MyGen<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T get(){
        return obj;
    }
}

public class Generic {

    public static <E> void PrintArray(E[] elements){
        for(E ele: elements){
            System.out.println(ele);
        }
    }

    public static void main(String[] args){

        MyGen<String> s = new MyGen<String>();
        s.add("Aks");
        System.out.println(s.get());

        MyGen<Boolean> b = new MyGen<Boolean>();
        b.add(true);
        System.out.println(b.get());

        PrintArray(new Character[]{'f','a','d','a'});
        PrintArray(new Boolean[]{true,false,false,true,true});
    }
}
