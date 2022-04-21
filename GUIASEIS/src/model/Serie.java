package model;

import org.jetbrains.annotations.NotNull;

public final class Serie extends Entretenimiento {
    private String creator;
    private Integer seasons;

    @Override
    public int compareTo(@NotNull Entretenimiento o) {
        return 0;
    }
}
