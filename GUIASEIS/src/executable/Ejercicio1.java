package executable;

import model.Persona;

import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {

        String name;
        Integer age;
        char gender;
        Double weight;
        Double height;

        System.out.println("Ingrese Nombre");
        name = scanner.nextLine();
        System.out.println("Ingrese edad");
        age = scanner.nextInt();
        System.out.println("Ingrese sexo => H o F");
        gender = scanner.next().charAt(0);
        System.out.println("Ingrese peso => FORMATO = 60,0");
        weight = scanner.nextDouble();
        System.out.println("Ingrese altura => FORMATO = 1,9");
        height = scanner.nextDouble();

        Persona persona1 = new Persona(name, age, gender, weight, height);
        Persona persona2 = new Persona(name, age, gender);
        Persona persona3 = new Persona();
        persona3.setGender('M');
        persona3.setAge(25);
        persona3.setWeight(48.9);
        persona3.setHeight(1.9);
        persona3.setName("Maria");


        HashMap<Integer, Persona> persona = new HashMap<>();
        persona.put(persona1.hashCode(), persona1);
        persona.put(persona2.hashCode(), persona2);
        persona.put(persona3.hashCode(), persona3);


        persona.forEach((key, value) -> {
            int result = value.calculateIMC();
            if (result == 0) {
                System.out.println("PESO IDEAL ! ! ! ");
            } else if (result == 1) {
                System.out.println("SOBREPESO :/");
            } else if (result == -1) {
                System.out.println("POR DEBAJO DEL PESO IDEAL T_T");
            } else if (result == 999) {
                System.out.println("ERROR CALCULANDO PESO IDEAL.");
            }
        });


    }

}
