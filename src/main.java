public class main {
    public static void main(String[] args) {
       BmiService service = new BmiService ();
       int weight = 98; // вес
       double height = 1.89F; // рост
        double bmi = Math.ceil(service.calculate(weight, height));
        System.out.println(bmi);

    }
}
