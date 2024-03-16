import java.util.Scanner;
public class GreatestNumber
{
    public static void main(String args[]){
        int a,b,c;
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        a = S.nextInt();
        System.out.println("Enter the value of b:");
        b = S.nextInt();
        System.out.println("Enter the value of c:");
        c = S.nextInt();


    if(a>b && a >c){
        System.out.println("A is Greatest");
    }
    else if(b > a && b > c){
        System.out.println("B is Greatest");
    }
    else if(c > a && c > b){
        System.out.println("C is Greatest");
    }
    else{
        System.out.println("All numbers are equal");
    }
}

}