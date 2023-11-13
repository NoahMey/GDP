public class FindInArrayy{
    // Ihre Lösung kommt hier hin
    public static int findFirst(char[] a, char b){
        for(int x = 0; x < a.length; x++){
            if (a[x] == b){
                return x;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(findFirst("UniverstitätBasel".toCharArray(), 'e'));
        System.out.println(findFirst("UniverstitätBasel".toCharArray(), 'i'));
        System.out.println(findFirst("UniverstitätBasel".toCharArray(), 'y'));
    }
}
