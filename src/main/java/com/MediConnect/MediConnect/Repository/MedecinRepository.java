package com.MediConnect.MediConnect.Repository;

import com.MediConnect.MediConnect.Entity.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedecinRepository extends JpaRepository<Medecin,Integer> {
}
