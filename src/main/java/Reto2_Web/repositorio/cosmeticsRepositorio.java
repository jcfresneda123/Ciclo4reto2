/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reto2_Web.repositorio;

import Reto2_Web.modelo.cosmetics;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import Reto2_Web.interfaces.Interfacecosmetics;

/**
 *
 * @author USUARIO
 */
@Repository
public class cosmeticsRepositorio {
    @Autowired
    private Interfacecosmetics repository;

    public List<cosmetics> getAll() {
        return repository.findAll();
    }

    public Optional<cosmetics> getClothe(String reference) {
        return repository.findById(reference);
    }
    public cosmetics create(cosmetics clothe) {
        return repository.save(clothe);
    }

    public void update(cosmetics clothe) {
        repository.save(clothe);
    }
    
    public void delete(cosmetics clothe) {
        repository.delete(clothe);
    }
}
