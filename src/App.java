import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();
        int additionPositives = 0;
        int additionNegatives = 0;
        int mediaPositives = 0;
        int mediaNegatives = 0;
        int counterPositives = 0;
        int counterNegatives = 0;
        int counterZero = 0;

        for (int i = 0; i <= 120; i++) {
            int number = random.nextInt(201) - 100;
            System.out.println("Número #" + i + ": " + number);

            if (number > 0) {
                additionPositives += number;
                counterPositives++;
                mediaPositives = additionPositives / counterPositives;
            } else if (number < 0) {
                additionNegatives += number;
                counterNegatives++;
                mediaNegatives = additionNegatives / counterNegatives;
            } else {
                counterZero++;
            }

        }
        System.out.printf("La suma de los %d números positivos es: %d\n", counterPositives, additionPositives);
        System.out.printf("La suma de los %d números negativos es: %d\n", counterNegatives, additionNegatives);
        System.out.printf("La media de los números positivos es: %d\n", mediaPositives);
        System.out.printf("La media de los números negativos es: %d\n", mediaNegatives);
        System.out.printf("La cantidad de ceros obtenidos es: %d\n", counterZero);
    }
}