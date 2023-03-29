import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Digita a temp em Celsius");
        float temp_celsius = input.nextFloat();

        System.out.println(temp_celsius);

        // (0 °C × 9/5) + 32
        float temp_f = ( temp_celsius * 1.8f ) + 32;

        System.out.println(temp_f);

        input.close();
    }
}