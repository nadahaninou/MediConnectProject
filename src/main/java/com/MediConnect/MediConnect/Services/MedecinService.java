package com.MediConnect.MediConnect.Services;

import com.MediConnect.MediConnect.Entity.Medecin;

import java.util.List;

public interface MedecinService {
    public Medecin AddMedecin(Medecin medecin);
    public Medecin UpdateMedecin(Medecin medecin,int Id) throws Exception;
    public List<Medecin> GetAllmedecins();
    public Medecin DeleteMedecin(int Id) throws Exception;
}

