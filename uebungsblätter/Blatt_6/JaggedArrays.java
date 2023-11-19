public class JaggedArrays {
      // Ihre Lösung kommt hier hin


    public static int[][] create(int[] arr) {
        int[][] na = new int[arr.length][];
        for (int x = 0; x<=arr.length-1; x++){
            na[x] = new int[arr[x]];
        }
        for (int x = 0; x<=arr.length-1; x++){
            int ele = arr[x];
            for(int y = 0; y < ele; y++){
                na[x][y] = y;
            }
        
        }
        return na;
    }

    public static void main(String[] args) {
        int[][] arr = create(new int[]{5,1,0,7,8});
        for(int[] row : arr) {
            System.out.println(java.util.Arrays.toString(row));
        }
     }
}
