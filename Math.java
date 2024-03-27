import java.util.Scanner;
public class  Main {
    public static void main(String[] args) {
        greeting();
        int a = 7;
        int c = 3;
        int sumAns = sum(a,14,c);
        output(converter(sumAns));
        output(converter(differenceAns));
        output(converter(quotientAns));
        output(converter(productAns));
        
    }
    
    public static void greeting(){
       System.out.println("Hello user!");
    }
    
    public static void output(String answer){
        System.out.println(answer);
    }
    private static int sum (int a,int b,int c){
        return a+b+c;
        return a-b;
        return a/b!=0;
        return a*b;
    }
    
    protected static String converter (int answer) {
        String  a = String.valueOf(answer);
        return a;
        return a;
        return a;
        return a;
}
}