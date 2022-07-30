/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafolio.aal.Service;

import com.portafolio.aal.Entity.Skills;
import com.portafolio.aal.Repository.SkillsRepo;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author lazze
 */
@Service
@Transactional
public class SkillsService {
    @Autowired
    SkillsRepo skillsRepo;
    
    
    public List<Skills> list() {
        return skillsRepo.findAll();
    }

    public Optional<Skills> getOne(int id) {
        return skillsRepo.findById(id);
    }

    public Optional<Skills> getByNombreSkill(String nombreSkill) {
        return skillsRepo.findByNombreSkill(nombreSkill);
    }

    public void save(Skills ski) {
        skillsRepo.save(ski);
    }

    public void delete(int id) {
        skillsRepo.deleteById(id);
    }

    public boolean existsById(int id) {
        return skillsRepo.existsById(id);
    }

    public boolean existsByNombreSkill(String nombreSkill) {
        return skillsRepo.existsByNombreSkill(nombreSkill);
    }
    


}
