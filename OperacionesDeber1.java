package clases.basicas;

/**
 * @Instituto Rumiñahui
 * @author SSolis
 */
public class OperacionesDeber {

    public static void metodo1(){
        boolean b = true;
        int i=1;
        if(b){
            i++;
        }
        System.out.println(i);
    }
     public static void metodo2(){
        boolean b=(true&&!false)?
                false:true;
         System.out.println(b);
    }
     public static void metodo3(){
         int a = 5;
         System.out.println(a++);
     }
     public static void metodo4(){
         int x=1;
         for (int i=3;i<5;i++){
             x+=i;
         }
         System.out.println(x);
     }
     public static void metodo5(){
         int a=2;
         int b=3;
         for (int i=3;i>1;i--){
             a+=b/i;
         }
     System.out.println(a);
     }
      public static void metodo6(){
          int x=4;
          switch (x){
              case 4:
                  x++;
       
          }
        System.out.println(x);          
      }
           public static void metodo7(){
               int i=0;
               switch (i){
                   default:
                       i++;
                   case 1:
                       ++i;
                       break;
               }
         System.out.println(i);
      }
            public static void metodo8(){
                int a=12;
                int b=(a%10)+5*2%3;
                System.out.println(b);
            }
             public static void metodo9(){
                 int d=4;
                 if(d%3==1){
                     d=1;
                 }
                 else{
                     d=0;
                 }
                 System.out.println(d-d%1);
             }
              public static void metodo10(){
                  for (int i=0;i<=2;i++)
              System.out.println(i);
                  for (int i=0;i<=2;++i)
                      System.out.println(i);
              }
                

