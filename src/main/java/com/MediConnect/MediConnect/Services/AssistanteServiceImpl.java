package com.MediConnect.MediConnect.Services;

import com.MediConnect.MediConnect.Entity.Assistante;
import com.MediConnect.MediConnect.Repository.AssistanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AssistanteServiceImpl implements AssistanteService{
    @Autowired
    AssistanteRepository assistanteRepository;
    @Override
    public Assistante AddAssistante(Assistante assistante) {
        return assistanteRepository.save(assistante);
    }

    @Override
    public Assistante UpdateAssistante(Assistante assistante, int Id) throws Exception {
        Optional<Assistante> assistante1=assistanteRepository.findById(Id);
        if(assistante1.isPresent()){
            Assistante assistante2=assistante1.get();
            assistante2.setPrenom(assistante.getPrenom());
            assistante2.setNom(assistante.getNom());
            assistante2.setEmail(assistante.getEmail());
            assistante2.setMotDePassse(assistante.getMotDePassse());
            assistante2.setExperience(assistante.getExperience());
            assistanteRepository.save(assistante2);
            return assistante2;

        }
        else {
            throw new Exception("this assistant doesn't exist");
        }
    }

    @Override
    public List<Assistante> GetAllAssistante() {

        return assistanteRepository.findAll();
    }

    @Override
    public Assistante DeleteAssistante(int Id) throws Exception {
        Optional<Assistante> assistante1=assistanteRepository.findById(Id);
        if(assistante1.isPresent()){
            Assistante assistante2=assistante1.get();
            assistanteRepository.delete(assistante2);
            return assistante2;

    }
        else {
            throw new Exception("this assistant doesn't exist");
        }
}}
