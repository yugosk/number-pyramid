import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int num;

        System.out.println("Insira um número: ");
        num = myObj.nextInt();

        System.out.println("Pirâmide: ");
        for (int i = 1; i <= num; i++) {
            var lineResult = "";
            for (int j = 0; j<i; j++) {
                lineResult += i;
            }
            System.out.println(lineResult);
        }
    }
}
