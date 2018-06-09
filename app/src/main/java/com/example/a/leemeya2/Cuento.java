package com.example.a.leemeya2;


import java.io.Serializable;


//se debe serializar el objeto completo y ahi recien enviar a la otra actividad
public class Cuento implements Serializable{
    private int Id;
    private String Titulo;
    private String Detalle;
    private int Imagen;
    private String Genero;
    private  String Autor;

    public Cuento(int id, String titulo, String detalle, int imagen, String genero, String autor) {
        Id = id;
        Titulo = titulo;
        Detalle = detalle;
        Imagen = imagen;
        Genero = genero;
        Autor = autor;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String genero) {
        Genero = genero;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDetalle() {
        return Detalle;
    }

    public void setDetalle(String detalle) {
        Detalle = detalle;
    }

    public int getImagen() {
        return Imagen;
    }

    public void setImagen(int imagen) {
        Imagen = imagen;
    }
}
