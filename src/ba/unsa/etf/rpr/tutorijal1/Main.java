package ba.unsa.etf.rpr.tutorijal1;
import java.util.Scanner;
public class Main {
    public static int sumaCifara(int n){
        int s=0;
        while(n!=0){
            int c=(n%10);
            s+=c;
            n/=10;
        }
        return s;
    }
    public static void main(String[] args) {
        Scanner ulaz=new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n=ulaz.nextInt();
        System.out.print("Brojevi koji su djeljivi sa sumom svojih cifara su: ");
        for(int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                System.out.print(i + " ");
            }
        }
        // write your code here
    }
}
