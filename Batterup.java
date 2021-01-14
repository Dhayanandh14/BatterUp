import java.util.*;

class Batterup {
  public static void main(String[] args) {
    Scanner kbd = new Scanner(System.in);
    int tot=0,mcount=0,pcount=0;
    double sum=0;
      int n=kbd.nextInt();
      for(int i=0;i<n;i++){
        int p = kbd.nextInt();
        if(p==-1){
          mcount=mcount+1;
        }else{  sum=sum+p;}
         pcount = pcount +1;
        
      }   
      tot=pcount-mcount;
      System.out.println(sum/tot);
    kbd.close();
  }
}