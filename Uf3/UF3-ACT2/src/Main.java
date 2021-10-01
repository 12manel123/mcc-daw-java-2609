import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.PrintStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Main p =new Main();
        File fichero = new File ("usuaris");
        File fichero2 = new File ("fichero");
        p.llista1(new Scanner(fichero));
        p.llista2(new Scanner(fichero), new PrintStream(fichero2));
        p.imprimir(new Scanner(fichero2));
    }

    public void llista1 (Scanner s) {
        while (s.hasNextLine()) {
            String linea = s.nextLine();
            System.out.println(linea);
        }
        System.out.println();
    }

    public void llista2(Scanner s, PrintStream n1) {
        int num= 1111;
        int num1=0;
        PrintStream arxiuEscriptura = new PrintStream(n1);
        while (s.hasNextLine()) {
            String linea = s.nextLine();
            String[] parts = linea.split(",");
            String part1 = parts[0];
            String part2 = parts[1];
            String[] parts1 = part2.split("");
            String[] parts2 = part1.split(" ");
            arxiuEscriptura.print(parts1[1]);
            arxiuEscriptura.print(parts2[0]+":");
            arxiuEscriptura.println(num+num1);
            num1++;
        }
        arxiuEscriptura.close();
    }

    public void imprimir (Scanner n) {
        while (n.hasNextLine()) {
            String linea1 = n.nextLine();
            System.out.println(linea1);
        }
    }
}