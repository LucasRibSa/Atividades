import java.util.Scanner;
public class triangulos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int l1;
        int l2;
        int l3;
        System.out.println("digite o valor do lado 1: ");
        l1 = scanner.nextInt();
        System.out.println("digite o valor do lado 2: ");
        l2 = scanner.nextInt();
        System.out.println("digite o valor do lado 3: ");
        l3 = scanner.nextInt();

        if ((l1 > l2+l3) || (l2 > l1+l3) || (l3 > l1+l2)){
            System.out.println("Não é um triangulo");
        }else if(l1 == l2 && l2 == l3) {
            System.out.println("O triangulo é equilatero");
        } else if (l1 == l2 || l2 == l3 || l1 == l3){
            System.out.println("O triangulo é isoceles");
        } else if (l1 != l2 && l2!= l3 && l3!=l1) {
            System.out.println("O triangulo é escaleno");
        }


    }
}
