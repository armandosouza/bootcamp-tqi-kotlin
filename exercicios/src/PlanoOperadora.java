import java.util.Scanner;

public class PlanoOperadora {
    public static void main(String[] args) {
        final String planoPequeno = "P";
        final String planoMedio = "M";
        final String planoGrande = "G";

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua opção:");
        String planoUsuario = scanner.next();

        switch(planoUsuario) {
            case planoPequeno: {
                System.out.println("Apenas 500MB de internet");
                break;
            }
            case planoMedio: {
                System.out.println("2GB de internet e ligações ilimitadas");
                break;
            }
            case planoGrande: {
                System.out.println("5GB de internet, ligações ilimitadas e SMS ilimitado");
                break;
            }
            default: {
                System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
