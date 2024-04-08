package com.MediConnect.MediConnect.Controller;

import com.MediConnect.MediConnect.Entity.Medecin;
import com.MediConnect.MediConnect.Services.MedecinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Medecin")
public class MedecinController {
    @Autowired
    MedecinService medecinService;


    @PostMapping("/AddMedecin")
    public Medecin AddMedecin(@RequestBody Medecin medecin){
        return medecinService.AddMedecin(medecin);
    }
    @PutMapping("/updateMedecin/{Id}")
    public Medecin UpdateMedecin(@RequestBody Medecin medecin,@PathVariable int Id) throws Exception {
        return medecinService.UpdateMedecin(medecin,Id);
    }
    @GetMapping("/getAllMedecin")
    public List<Medecin> GetAllMedecins(){
        return medecinService.GetAllmedecins();
    }
    @DeleteMapping("/DeleteMedecin/{Id}")
    public Medecin DeleteMedecin(@PathVariable int Id) throws Exception {
        return medecinService.DeleteMedecin(Id);
    }
}
