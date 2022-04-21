package model;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Objects;

public class Persona {
    private String name = "";
    private Integer age = 0;
    private String DNI = generateDNI();
    private char gender = 'H';
    private Double weight = 0.0;
    private Double height = 0.0;

    /* Constructores */
    public Persona() {

    }

    public Persona(String name, Integer age, char gender) {
        this.name = name;
        this.age = age;
        checkGender(gender);
        this.DNI = generateDNI();
    }

    public Persona(String name, Integer age, char gender, Double weight, Double height) {
        this.name = name;
        this.age = age;
        this.DNI = generateDNI();
        checkGender(gender);
        this.weight = weight;
        this.height = height;
    }
    /* Constructores */

    /* Getters y Setters */

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public void setHeight(Double height) {
        this.height = height;
    }


    /* Getters y Setters */

    public int calculateIMC() {
        double value = weight / Math.pow(height, 2);
        if (value < 20) {
            return -1;
        } else if (value >= 20 && value <= 25) {
            return 0;
        } else if (value > 25) {
            return 1;
        }
        return 999;
    }

    public boolean isAdult() {
        return age > 18;
    }

    private void checkGender(char gender) {
        if (this.gender == 'H' || this.gender == 'M' || this.gender == 'h' || this.gender == 'm') {
            setGender(gender);
        } else {
            setGender('H');
        }
    }

    private String generateDNI() {
        //Random random = new Random();
        //return String.format("%08d", random.nextInt(99999999));
        return String.format(RandomStringUtils.randomNumeric(8));
    }

    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DNI='" + DNI + '\'' +
                ", gender=" + gender +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return DNI.equals(persona.DNI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(DNI);
    }
}
