import java.util.*;
public class Main {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if(n>0)
          System.out.println("Positive Number");
      else if(n<0)
          System.out.println("Negative Number");
      else
          System.out.println("Netural Number");
      switch(n%7){
          case 0:{
              System.out.println("Sunday");
              break;}
          case 1:{
              System.out.println("Monday");
              break;}
          case 2:{
              System.out.println("Tuesday");
        break;}
          case 3:{
              System.out.println("Wednesday");
               break;}
          case 4:{
              System.out.println("Thursday");
                  break;}
          case 5:{
              System.out.println("Friday");
                  break;}
          case 6:{
              System.out.println("Saturday");
                  break;}
          default:
              System.out.println("it is a negative number");
      }



      if(n<0){
          for(int i=n;i<=0;i++){
              System.out.print(i+" ");
          }
      }
      else
      for(int i=0;i<=n;i++){
          System.out.print(i+" ");
      }
        System.out.println();



        if(n<0){
            for(int i=0;i>=n;i--){
                System.out.print(i+" ");
            }
        }
        else
            for(int i=n;i>=0;i--){
                System.out.print(i+" ");
            }

        System.out.println();

        do{
            System.out.print("1 2 3 ");
            n--;
        }
        while(n>0);


    }
}
