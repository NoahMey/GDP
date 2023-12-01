public class BMI {

    public static void main(String[] args) {
        
        double height = Math.pow((Double.parseDouble(args[0]) /100), 2); // Gives 1.88m 
        double weight = (Double.parseDouble(args[1])); //Gives 88
        double result = (weight/height);

       System.out.println(String.format("Ihr BMI betraegt: %f", result));
    }
}
