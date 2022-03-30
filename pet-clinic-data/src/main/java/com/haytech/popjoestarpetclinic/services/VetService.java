package com.haytech.popjoestarpetclinic.services;

import com.haytech.popjoestarpetclinic.model.Vet;

import java.util.Set;

public interface VetService {
    Vet findById(Long id);
    Vet save(Vet pet);

    Set<Vet> findAll();
}
