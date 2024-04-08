package com.MediConnect.MediConnect.Repository;

import com.MediConnect.MediConnect.Entity.Assistante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AssistanteRepository extends JpaRepository<Assistante,Integer> {
}
