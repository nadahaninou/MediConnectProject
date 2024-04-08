package com.MediConnect.MediConnect.Services;

import com.MediConnect.MediConnect.Entity.Assistante;


import java.util.List;

public interface AssistanteService {
    public Assistante AddAssistante (Assistante  assistante);
    public Assistante  UpdateAssistante (Assistante  assistante,int Id) throws Exception;
    public List<Assistante > GetAllAssistante ();
    public Assistante  DeleteAssistante (int Id) throws Exception;
}
