public class VetorDecrescente {
    public static void main(String[] args) {
        int[] vetor = {1, 4, 6, 9, 21, 33, 98, 209, 444, 334, 76, 189};
        for (int indice =vetor.length -1; indice >= 0; indice--) {
            System.out.println(vetor[indice]);
        }
    }
}
