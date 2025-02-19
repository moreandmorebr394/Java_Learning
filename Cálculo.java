import java.util.Scanner;
public class Main {
    public static void main (String[]args){
        var scanner = new Scanner (System.in);
        System.out.println("Informe um número");
        while(true){
            System.out.println("Informe o número para verificação");
            var toVerify = scanner.nextInt();
            if (toVerify < number) {
                System.out.printf("Informe um nümero maior que %s \n", number);
                continue;
            }
        var result = toVerify % number;
        System.out.printf("%s %% %s = %s \n", toVerify, number, result);
        if (result! = 0) 
        break;
        }
    }
}