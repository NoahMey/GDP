public class FitzeFatzeArray {
    // Ihre Lösung kommt hier hin
    
    public static int[] eliminate(int[] a){
        int count = 0;
        for(int elem : a){
            if((elem %3 ==0)^(elem %5 ==0)){
                count += 1;
            }
        }
        int[] na = new int[a.length-count];
        int nac = 0;
        for (int x = 0; x<a.length; x++){
            if(!((a[x] %3 ==0)^(a[x] %5 ==0))){
                na[nac] = a[x];
                nac += 1;
            }
        }
        return na;
    }

    public static void main(String[] args) {
        System.out.println(java.util.Arrays.toString(
            eliminate(new int[]{3, 5, 6, 7, 2, 1, 15, 24, 25, 30, 33})
        ));
    }
}