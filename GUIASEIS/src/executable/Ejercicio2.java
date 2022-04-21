package executable;

import model.Password;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void start() {
        System.out.println("Ingrese cantidad de contraseñas a almacenar");
        int index = scanner.nextInt();
        HashMap<Integer, Password> pwList = new HashMap<>();
        HashMap<Integer, Boolean> isStrongList = new HashMap<>();

        for (int i = 0; i < index; i++) {
            System.out.println("Ingrese longitud de la contraseña");
            int size = scanner.nextInt();
            Password pw = new Password(size);
            isStrongList.put(pw.hashCode(), pw.isStrong());
            pwList.put(pw.hashCode(), pw);
        }

        for (Map.Entry<Integer, Password> entry : pwList.entrySet()) {
            System.out.println(String.format("HashCode: %s | Password: %s | isStrong: %s",
                    entry.getKey(),
                    entry.getValue().getPassword(),
                    isStrongList.get(entry.getKey())));
        }
        Password pw1 = new Password(5);
        Password pw2 = new Password(5);
        System.out.println(String.format("Password1: %s ||" +
                " Password2: %s ||" +
                " CompareTo: %s", pw1, pw2, pw2.compareTo(pw1)));


    }
}
