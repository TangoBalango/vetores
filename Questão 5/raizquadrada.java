public class raizquadrada {
    public static void main(String[] args) {
        int[] A = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};
        int[] B = new int[A.length];
        
        for(int i = 0; i < A.length; i++) {
            B[i] = A[i] * i;
        }
        System.out.println("Índice: 0  1  2  3  4  5  6  7  8  9");
        System.out.print("Vetor A: ");
        for(int num : A) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nVetor B (raiz quadrada): ");
        for(int num : B) {
            System.out.print(num + " ");
        }
    }
}