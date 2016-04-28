import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exec8{
  public static void main(String args[]){
    ExecutorService executor=Executors.newSingleThreadExecutor();
    Runnable t=()->{
      String threadName=Thread.currentThread().getName();
      System.out.println("HELLO "+threadName);
    };
    executor.submit(t);

    //SIgue esperando por nuevas tareas
  }
}
