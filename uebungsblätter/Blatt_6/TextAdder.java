public class TextAdder {
    public static int sumNumbers(String a){
        int sum = 0;
        char[] na = new char[a.length()];
        na = (a.toCharArray());
        System.out.println(na[0]);
        for (char element : na){
            if(Character.isDigit(element)){
                sum += Character.getNumericValue(element);
            }
        }
        return sum;
    }


    public static void main(String[] args) {
        System.out.println(sumNumbers("aa1d23c4tz5io0"));
    }
}
