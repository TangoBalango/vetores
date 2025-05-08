public class quadrado {
    public static void main(String[] args){
        int[] A = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] B = new int[A.length];
    
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
    
        System.out.print("Vetor A: ");
        for (int num : A) {
            System.out.print(num + " ");
        }
        
        System.out.print("\nVetor B (quadrados): ");
        for (int num : B) {
            System.out.print(num + " ");
        }
    
    }
}