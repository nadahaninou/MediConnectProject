package com.MediConnect.MediConnect.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
public class Medecin  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Medecin;
    private String nom;
    private String prenom;
    private String email;
    private String motDePassse;
    private String Specialite;
    private int experience;

    public Medecin(int id_Medecin, String nom, String prenom, String email, String motDePassse, String specialite, int experience) {
        Id_Medecin = id_Medecin;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.motDePassse = motDePassse;
        Specialite = specialite;
        this.experience = experience;
    }

    public String getSpecialite() {
        return Specialite;
    }

    public void setSpecialite(String specialite) {
        Specialite = specialite;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getId_Medecin() {
        return Id_Medecin;
    }

    public void setId_Medecin(int id_Medecin) {
        Id_Medecin = id_Medecin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePassse() {
        return motDePassse;
    }

    public void setMotDePassse(String motDePassse) {
        this.motDePassse = motDePassse;
    }
}
