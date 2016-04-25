public class SleepMessageIn{
  public static void main(String args[]){
    String importantInfo[]={
    "Muy cerca de ocaso, yo te bendigo vida",
    "Porque nunca me diste ni esperanza fallida",
    "Ni trabajos injustos, ni pena inmeracida",
    "Porque veo al final de mi rudo camino",
    "Que yo fui el arquitecto de mi propio destino"
    };

    for(int i=0;i<importantInfo.length;i++){
      try{
        Thread.sleep(4000);
      }catch(InterruptedException e){
        return;
      }
      System.out.println(importantInfo[i]);
    }
  }
}
