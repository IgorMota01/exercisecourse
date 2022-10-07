package com.exercise.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Cliente {
    private String name;
    private String email;
    private Date dataAniversario;
    private static SimpleDateFormat diaNascimento = new SimpleDateFormat("dd/MM/yyyy");

    public Cliente() {

    }

    public Cliente(String name, String email, Date dataAniversario) {
        this.name = name;
        this.email = email;
        this.dataAniversario = dataAniversario;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDataAniversario() {
        return dataAniversario;
    }

    public void setDataAniversario(Date dataAniversario) {
        this.dataAniversario = dataAniversario;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Cliente: ");
        sb.append(getName() + " ");
        sb.append(diaNascimento.format(getDataAniversario()) + " - ");
        sb.append(getEmail());
        return sb.toString();
    }
}
