package model;

import org.apache.commons.lang3.RandomStringUtils;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class Password implements Comparable<Password> {
    private int size;
    private String password;

    public Password() {
    }

    public Password(int size) {
        this.size = size;
        this.password = generatePassword();
    }

    private String generatePassword() {
        return RandomStringUtils.randomAlphanumeric(this.size);
    }

    public boolean isStrong() {
        int charUpperCase = 0;
        int charLowerCase = 0;
        int charDigit = 0;
        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                charLowerCase += 1;
            } else if (Character.isUpperCase(c)) {
                charUpperCase += 1;
            } else if (Character.isDigit(c)) {
                charDigit += 1;
            }
        }

        return charUpperCase > 2 && charLowerCase > 1 && charDigit > 5;
    }

    public int getSize() {
        return size;
    }

    public String getPassword() {
        return password;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Password{" +
                "size=" + size +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password1 = (Password) o;
        return size == password1.size && password.equals(password1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(size, password);
    }


    @Override
    public int compareTo(@NotNull Password o) {
        return password.compareTo(o.getPassword());
    }
}
