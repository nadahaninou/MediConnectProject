package com.MediConnect.MediConnect.Services;

import com.MediConnect.MediConnect.Entity.Medecin;
import com.MediConnect.MediConnect.Repository.MedecinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class MedecinServiceImpl implements MedecinService{
    @Autowired
    MedecinRepository medecinRepository;
    @Override
    public Medecin AddMedecin(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public Medecin UpdateMedecin(Medecin medecin, int Id) throws Exception {
        Optional<Medecin> medecin1=medecinRepository.findById(Id);
        if(medecin1.isPresent()){
            Medecin medecin2=medecin1.get();
            medecin2.setPrenom(medecin.getPrenom());
            medecin2.setNom(medecin.getNom());
            medecin2.setEmail(medecin.getEmail());
            medecin2.setMotDePassse(medecin.getMotDePassse());
            medecinRepository.save(medecin2);
            return  medecin2;
        }
        else{
            throw new Exception("this Medecin doesn't exist");
        }

    }

    @Override
    public List<Medecin> GetAllmedecins() {
        return medecinRepository.findAll();
    }

    @Override
    public Medecin DeleteMedecin(int Id) throws Exception {
        Optional<Medecin> medecin1=medecinRepository.findById(Id);
        if(medecin1.isPresent()){
            Medecin medecin2=medecin1.get();
           medecinRepository.delete(medecin2);
            return  medecin2;
        }
        else {
        throw new Exception("this medecin doesn't exist");}
    }


}
