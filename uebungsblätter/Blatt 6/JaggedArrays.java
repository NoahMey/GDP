public class JaggedArrays {
      // Ihre Lösung kommt hier hin
    
      public static void main(String[] args) {
        int[][] arr = create(new int[]{5,1,0,7,8});
        for(int[] row : arr) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
