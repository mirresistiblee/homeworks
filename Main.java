import java.util.Scanner;
 public class Main
{
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

//испольмзуем массивы 3 на 4  в инпут пишем 12 разных чисел 
     int[][] user = new int[3][4];
//output 
     System.out.println("Введите числа для того,чтобы заполнить массивы :" );
//цикл     
     for (int i = 0; i < 3; i++) {
         for (int j = 0; j < 4; j++) {
// scanner.nextInt() ; нужен чтобы пользователь мог ввести любые  числа,в инпут пишем 12 разных чисел  
         user [i][j]=scanner.nextInt() ;
     }
 }
 //output
 System.out.println("В результате мы получили числа, которые делятся на 2 и при этом остаток от деления нечетен:");
 for (int i = 0; i < 3; i++) {
     for(int j =  0; j < 4; j++) {
//даем значение при котором число должно делится на два и остаток должен быть равен нечетному числу 
         if (user[i][j] %2 !=0){
        // вывод 
         System.out.print(user[i][j] + " ");
                }
	        }
        }
    }
}