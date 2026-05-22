import java.util.Scanner;

public class hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double n1 = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        char op = input.next().charAt(0);
        System.out.print("Enter second number: ");
        double n2 = input.nextDouble();
        
        double res;
        switch (op) {
            case '+': res = n1 + n2; break;
            case '-': res = n1 - n2; break;
            case '*': res = n1 * n2; break;
            case '/': res = (n2 != 0) ? n1 / n2 : 0; 
                      if(n2==0) System.out.println("Error: Div by zero"); break;
            default: System.out.println("Invalid op"); return;
        }
        System.out.println("Result: " + res);
        input.close();
    }
}
