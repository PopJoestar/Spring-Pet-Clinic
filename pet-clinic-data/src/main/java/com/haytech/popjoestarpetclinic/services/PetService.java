package com.haytech.popjoestarpetclinic.services;

import com.haytech.popjoestarpetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);
    Pet save(Pet pet);

    Set<Pet> findAll();
}
