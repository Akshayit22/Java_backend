class lambda{
        // normal function
        private void Hello(){
                System.out.println("Hello World.");
        }
        //Lambda exp
        // ()->{  System.out.println("Hello World."); }

        // normal function
        private int add(int a,int b){
                return a+b;
        }
        //Lambda exp
        // (int a,int b)->  System.out.println(a+b); 
        // (a,b)-> (a+b); 

        // normal function
        private int stringLength(String a){
                return a.length();
        }
        // Lambda exp
        // str ->  str.length(); 
}

// functional Interface
// it is interface having exactly one abstract method but can have many default & static methods

// @FunctionalInterface
// class MyInterface{
//         abstract int add(int a,int b);

//         default void sayBye(){
//         }
//         static void sayOk(){
//         }
// }

@FunctionalInterface
interface Addition{
    public int Add(int a,int b);
}



public class Lambda {

        public static void printS(String s){
                System.out.print(s+" ");
        }

        public void print(String s){
                System.out.print(s+" ");
        }

        public static void main(String[] args) {

                Addition obj = (a,b) -> (a+b);
                System.out.println(obj.Add(3,4));

                List<String> studs = Arrays.asList("Alice","Bob","Charlie");

                studs.forEach(Lambda::printS);
                //            class::method  as method is static

                Lambda l = new Lambda();
                studs.forEach(l::print);
                //        class Obj::method  as method is not static

        }
}
