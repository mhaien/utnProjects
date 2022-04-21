package model;

import org.jetbrains.annotations.NotNull;

public abstract sealed class Entretenimiento permits Serie, Videojuego {
    private String title;
    private boolean delivered;
    private String gender;

    public Entretenimiento() {
    }

    public Entretenimiento(String title, boolean delivered, String gender) {
        this.title = title;
        this.delivered = delivered;
        this.gender = gender;
    }

    public Entretenimiento(String title) {
        this.title = title;
    }

    public abstract int compareTo(@NotNull Entretenimiento o);

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public void setDelivered(boolean delivered) {
        this.delivered = delivered;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
