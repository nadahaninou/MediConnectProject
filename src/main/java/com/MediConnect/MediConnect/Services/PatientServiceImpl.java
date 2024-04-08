package com.MediConnect.MediConnect.Services;

import com.MediConnect.MediConnect.Entity.Patient;
import com.MediConnect.MediConnect.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceImpl implements PatientService{
    @Autowired
    PatientRepository patientRepository;
    @Override
    public Patient AddPatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient UpdatePatient(Patient patient, int Id) throws Exception {
        Optional<Patient> patient1=patientRepository.findById(Id);
        if(patient1.isPresent()){
            Patient patient2=patient1.get();
            patient2.setPrenom(patient.getPrenom());
            patient2.setNom(patient.getNom());
            patient2.setEmail(patient.getEmail());
            patient2.setMotDePassse(patient.getMotDePassse());
            patient2.setAge(patient.getAge());
            patient2.setSexe(patient.getSexe());
            patientRepository.save(patient2);
            return patient2;
        }
        else {
            throw new Exception("this patient doesn't exist");
        }
    }

    @Override
    public List<Patient> GetAllPatient() {
        return patientRepository.findAll();
    }

    @Override
    public Patient DeletePatient(int Id) throws Exception {
        Optional<Patient> patient1=patientRepository.findById(Id);
        if(patient1.isPresent()){
            Patient patient2=patient1.get();
            patientRepository.delete(patient2);
            return patient2;
        }
        else{
            throw new Exception("this patient doesn't exist");
        }
    }
}
