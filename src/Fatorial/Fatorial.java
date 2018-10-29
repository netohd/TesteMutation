package Fatorial;

public class Fatorial{
   public int fat (int n){
       int f=1;
       for (int i=1; i<=n; i++) f = f * i;
       return f;
   }
}
