void main() {
   import java.util.Scanner;

    public class SumarArrays {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int[] a = new int[5];
            int[] b = new int[5];
            int[] resultado = new int[5];

            System.out.println("Introduce los 5 valores del array a:");
            for (int i = 0; i < 5; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Introduce los 5 valores del array b:");
            for (int i = 0; i < 5; i++) {
                b[i] = sc.nextInt();
            }

            for (int i = 0; i < 5; i++) {
                resultado[i] = a[i] + b[i];
            }

            System.out.print("Array a: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(a[i] + " ");
            }

            System.out.print("\nArray b: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(b[i] + " ");
            }

            System.out.print("\nArray resultado: ");
            for (int i = 0; i < 5; i++) {
                System.out.print(resultado[i] + " ");
            }

            sc.close();
        }
    }
}
