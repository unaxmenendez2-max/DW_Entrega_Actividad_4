package org.cuatrovientos.curso;

public class Curso {
    private int id;
    private String nombre;
    private String categoria;
    private int participantes;
    private int plazas;

    public Curso(int id, String nombre, String categoria, int participantes, int plazas) {
        this.id = id;
        this.nombre = nombre;
        this.categoria = categoria;
        this.participantes = participantes;
        this.plazas = plazas;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public String getCategoria() { return categoria; }
    public int getParticipantes() { return participantes; }
    public int getPlazas() { return plazas; }

    // Plazas que quedan libres
    public int getPlazasLibres() {
        return plazas - participantes;
    }
}
