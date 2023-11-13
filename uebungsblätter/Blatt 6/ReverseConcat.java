public class ReverseConcat {
    
    public static double[] cat(double[] a, double[] b){
        double[] c = new double[a.length+b.length];
        for (int x = 0; x<a.length; x++){
            c[x] = a[x];
        }
        
        for(int x = 0; x<b.length; x++){
            c[x+a.length] = b[b.length-x-1];
        }
        return c;
    }

    public static void main(String[] args) {
        double[] arr1 = { 1.0, 2.0, 3.0};
        double[] arr2 = { 9.0, 8.0, 7.0, 6.0, 5.0, 4.0};
        System.out.println(java.util.Arrays.toString(cat(arr1, arr2)));
    }
}
