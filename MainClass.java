 import java.util.Scanner;
 public class MainClass {
    public static void main(String[] args) {
        System.out.println("Введите: ");
        Scanner scanner = new Scanner(System.in);

                String names = scanner.nextLine();
                char[] namesChar = new char[names.length()];
                for (int i = 0; i < names.length(); i++) {
                    namesChar[i] = names.charAt(i);
                    if (namesChar[i] >= 'a' && namesChar[i] <= 'z') { 
                        namesChar[i] = (char) (namesChar[i] - 32);
                    }
                    System.out.print(namesChar[i] + " ");
                }
            }
        }
    
    