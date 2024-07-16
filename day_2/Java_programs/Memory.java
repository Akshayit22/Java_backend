 public class Memory{
    public void finalize(){
        System.out.println("obj collected by GC.");
    }
    public static void main(String[] args){
        Memory o1 = new Memory();
        Memory o2 = new Memory();
        System.out.println(o1.toString() + o2.toString());
        o1=null;
        o2=null;
        System.gc();
    }
 }