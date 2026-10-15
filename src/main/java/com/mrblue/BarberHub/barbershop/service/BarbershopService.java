package com.mrblue.BarberHub.barbershop.service;
import com.mrblue.BarberHub.barbershop.entity.Barbershop;
import com.mrblue.BarberHub.barbershop.repository.BarbershopRepository;
import com.mrblue.BarberHub.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarbershopService {
    final BarbershopRepository barbershopRepository;

    public BarbershopService(BarbershopRepository barbershopRepository) {
        this.barbershopRepository = barbershopRepository;
    }

    public Barbershop insert(Barbershop obj){
        return barbershopRepository.save(obj);
    }

    public Barbershop findByID(Long id){
        Optional<Barbershop> barbershop = barbershopRepository.findById(id);

        if(barbershop.isEmpty()){
            throw new ResourceNotFoundException("Barbershop not found: " + id);
        }

        return barbershop.get();
    }

    public List<Barbershop> findAll(){
        return barbershopRepository.findAll();
    }

    public Barbershop update(Barbershop oldObj, Barbershop newObj){
        oldObj = updateBarbershop(oldObj, newObj);
        return barbershopRepository.save(oldObj);
    }

    public Barbershop updateBarbershop(Barbershop old_obj, Barbershop new_obj){
        old_obj.setName(new_obj.getName());
        old_obj.setSlug(new_obj.getSlug());
        old_obj.setDescription(new_obj.getDescription());
        old_obj.setPhone(new_obj.getPhone());
        old_obj.setAddress(new_obj.getAddress());
        old_obj.setLogoUrl(new_obj.getLogoUrl());
        old_obj.setPrimaryColor(new_obj.getPrimaryColor());
        old_obj.setSecondaryColor(new_obj.getSecondaryColor());
        old_obj.setActive(new_obj.getActive());
        return old_obj;
    }

    public void deleteByID(Long id){
        Optional<Barbershop> barbershop = barbershopRepository.findById(id);

        if (barbershop.isEmpty()) {
            throw new ResourceNotFoundException("Barbershop not found: " + id);
        }

        barbershopRepository.deleteById(id);
    }

}
