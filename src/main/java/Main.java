public class Main {
    public static void main(String[] args) {
        int[] array = {2, 3, 3, 5, 2, 1};
        Main m = new Main();
        int wynik = m.firstDuplicate(array);
        System.out.println(wynik);
    }

   private int firstDuplicate(int[] a) {
        int n = -1;
        int m = Integer.MAX_VALUE; // pomocniczy element do spr. odległości flagi od komurki tablicy

        int x = 0; // flaga do oznaczania porównywanego lementu
        // pętle dla kolejnych flag
        for (int j: a) {
            //petle do przeglądania tablicy
            for (int i = x + 1; i < a.length; i++) {
                if (a[i] == a[x] && m>i){
                        n = a[i];
                        m = i;
                }
            }
            ++x;
        }
        return n;
    }
}
