public class CopiarVetor{
    public static void main(String[] args){
        int[] A = {10, 20, 30, 40, 50};
    
        int[] B = new int[A.length];

        for (int i = 0; i < A.length; i++){
            B[i] = A[i];
        }
         System.out.println("Vetor: A ");
         for(int num: A){
            System.out.println(num + "");
         }
         System.out.println("Vetor: B ");
         for (int num: B){
            System.out.println(num + "");
         }
    }

}