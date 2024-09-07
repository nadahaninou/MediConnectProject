package com.MediConnect.MediConnect.Controller;

import com.MediConnect.MediConnect.Entity.Assistante;
import com.MediConnect.MediConnect.Services.AssistanteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util;
@RestController
@RequestMapping("/Assistante")
public class AssistanteController {
    @Autowired
    AssistanteService assistanteService;
    @PostMapping("/AddAssistante")
    public Assistante AddAssistante(@RequestBody Assistante assistante){
        return assistanteService.AddAssistante(assistante);
    }
    @PutMapping("/updateAssistante/{Id}")
    public Assistante updateAssistante(@RequestBody Assistante assistante,@PathVariable int Id) throws Exception {
        return assistanteService.UpdateAssistante(assistante,Id);
    }
    @GetMapping("/GetAllAssistants")
    public List<Assistante> getAllAssistant(){
        return assistanteService.GetAllAssistante();
    }
    @DeleteMapping("/DeleteAissistante/{Id}")
    public Assistante DeleteAssistante(@PathVariable int Id) throws Exception {
        return assistanteService.DeleteAssistante(Id);
    }
}
