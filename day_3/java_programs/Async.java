import java.util.concurrent.CompletableFuture;

public class Async{

    static String fetchData(String From){
        try{
            Thread.sleep(2000);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return "data comming from "+From;

    }
    public static void main(String[] args) {
        System.out.println("Async");
        
        //fetchData("WIFI");

        CompletableFuture<String> d1 = CompletableFuture.supplyAsync(()->fetchData("mobile"));
        CompletableFuture<String> d2 = CompletableFuture.supplyAsync(()->fetchData("router"));

        CompletableFuture<Void> RunAtSameTime = CompletableFuture.allOf(d1, d2);

        RunAtSameTime.thenRun(()->{
            try{
                String r1 = d1.join();
                String r2 = d2.join();

                System.out.println("r1 data : "+r1);
                System.out.println("r2 data : "+r2);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        });

        System.out.println("Other taskes.");

        try{
            Thread.sleep(3000);
            //show other tasks executing or programs will terminate.
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Done.");
    }
}
/* 
        Async
        Other taskes.
        //after 2 sec
        r1 data : data comming from mobile
        r2 data : data comming from router
        //after 1 sec
        Done.
*/