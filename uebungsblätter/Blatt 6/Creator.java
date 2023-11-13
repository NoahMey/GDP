public class Creator {
    // Ihre Lösung kommt hier hin

    public static int[] createMultiples(int a, int b){
        int[] na = new int[5];
        for (int x = 1; x<=b; x++){
            na[x-1] = (a*x);
        }
        return na;
    }
    
    public static void main(String[] args) {
        int[] arr = createMultiples(7,5);
        System.out.println(java.util.Arrays.toString(arr));
    }
}
