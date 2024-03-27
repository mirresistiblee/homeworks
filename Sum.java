import java.util.Scanner;
public class  Sum {
    public static void main(String[] args) {
        greeting();
        int a = 7;
        int c = 3;
        int sumAns = sum(a,14,c);
        output(converter(sumAns));
    }
    
    public static void greeting(){
       System.out.println("Hello user!");
    }
    
    public static void output(String answer){
        System.out.println(answer);
    }
    public static int sum (int a,int b,int c){
        return a+b+c;
    }
    
    public static String converter (int answer) {
        String  a = String.valueOf(answer);
        return a;
    }
}