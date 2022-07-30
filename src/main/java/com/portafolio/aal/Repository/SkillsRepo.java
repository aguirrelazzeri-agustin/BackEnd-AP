/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafolio.aal.Repository;

import com.portafolio.aal.Entity.Skills;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SkillsRepo extends JpaRepository <Skills, Integer> {
    public Optional<Skills> findByNombreSkill(String nombreSkill);
    public boolean existsByNombreSkill(String nombreSkill);
    
}
