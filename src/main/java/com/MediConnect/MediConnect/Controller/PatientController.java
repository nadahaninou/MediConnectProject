package com.MediConnect.MediConnect.Controller;

import com.MediConnect.MediConnect.Entity.Patient;
import com.MediConnect.MediConnect.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util;
@RestController
@RequestMapping("/Patient")
public class PatientController {
    @Autowired
    PatientService patientService;
    @PostMapping("/AddPatient")
    public Patient AddPatient(@RequestBody Patient patient){
        return patientService.AddPatient(patient);
    }
    @PutMapping("/UpdatePatient/{Id}")
    public Patient UpdatePatient(@RequestBody Patient patient,@PathVariable int Id) throws Exception {
        return patientService.UpdatePatient(patient,Id);
    }
    @GetMapping("/GetAllPatients")
    public List<Patient> GetAllPatients(){
        return patientService.GetAllPatient();
    }
    @DeleteMapping("/DeletePatient/{Id}")
    public Patient DeletePatient(@PathVariable int Id) throws Exception {
        return patientService.DeletePatient(Id);
    }
}
