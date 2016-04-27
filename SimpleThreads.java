public class SimpleThreads{
  //Display a message, preceded by
  //the name od the current thread
  static void threadMessage(String message){
    String threadName=Thread.current.Thread().getName();
    System.out.format("%s: %s%n",threadName,message);
  }
  private static class MessageLoop implements Runnable{
    public void run(){
      String[] importantInfo={"Muy cerca de mi ocaso, yo te bendigo vida",
                              "Porque nunca me diste ni esperanza fallida",
                              "Ni trabajos injustos, ni pena inmeracida",
                              "Porque veo al final de mi rudo camino",
                              "Que yo fui el arquitecto de mi propio destino"};
      try{
        for(int i=0;i<importantInfo.length;i++){
          //Pause for 4 seconds
          Thread.sleep(4000);
          //Print a message
          threadMessage(importantInfo[i]);
        }
      }catch(InterruptedException e){
        threadMessage("NO hexa terminado adios pues :(!)");
      }
    }
  }
  public static void main(String args[]) throws InterruptedException{
    //Delay, in milliseconds before
    //we interrupted MessageLoop
    //thread (default one hour)
    long patience=100*60*60;

    //If command line argument
    //present, gives patience
    if(args.length>0){
      try{
        patience = Long.parseLong(args[0]*1000);
      }catch(NumberFormatException e){
        System.out.println("El argumento debe ser entero");
        System.exit(1);
      }
    }
    threadMessage("Iniciando el hilo del ciclo de mensaje");
    long starTime=System.currentTimeMillis();
    Thread t=new Thread(new MessageLoop());
    t.start();

    threadMessage("Esperando que el hilo de ciclo de mensaje termine");
    //loop until MessageLoop
    //thread exits
    while(t.isAlive()){
      threadMessage("Aún esperando...");
      //Wait maxinum of 1 sexcond
    }
  }
}
