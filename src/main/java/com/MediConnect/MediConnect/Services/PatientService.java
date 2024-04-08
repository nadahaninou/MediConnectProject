package com.MediConnect.MediConnect.Services;


import com.MediConnect.MediConnect.Entity.Patient;

import java.util.List;

public interface PatientService {
    public Patient AddPatient(Patient patient);
    public Patient UpdatePatient (Patient patient,int Id) throws Exception;
    public List<Patient> GetAllPatient();
    public Patient DeletePatient(int Id) throws Exception;
}
