public class Flatten {
    // Ihre Lösung kommt hier hin
    public static int[] flatten(int[][] a){
        for(int x = 0; x<a.length; x++){
            for(int elem : a[x]){
                System.out.println(elem);
            }
        }
        int[] na = new int[3];
        return na;
    }
    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(
            flatten(new int[][]{
                {1,2},
                {0},
                {3,4,5,6},
                {7},
                {8,9,10}
            })
        ));
    }
}
