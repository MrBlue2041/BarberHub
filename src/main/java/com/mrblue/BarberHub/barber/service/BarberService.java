package com.mrblue.BarberHub.barber.service;

import com.mrblue.BarberHub.barber.entity.Barber;
import com.mrblue.BarberHub.barber.repository.BarberRepository;
import com.mrblue.BarberHub.barbershop.entity.Barbershop;
import com.mrblue.BarberHub.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BarberService {
    final BarberRepository barberRepository;

    public BarberService(BarberRepository barberRepository) {
        this.barberRepository = barberRepository;
    }

    public Barber insert(Barber obj){
        return barberRepository.save(obj);
    }

    public Barber findByID(Long id){
        Optional<Barber> barbershop = barberRepository.findById(id);

        if(barbershop.isEmpty()){
            throw new ResourceNotFoundException("Barber not found: " + id);
        }

        return barbershop.get();
    }

    public List<Barber> findAll(){
        return barberRepository.findAll();
    }

    public Barber update(Barber oldObj, Barber newObj){
        oldObj = updateBarber(oldObj, newObj);
        return barberRepository.save(oldObj);
    }

    public Barber updateBarber(Barber old_obj, Barber new_obj){
        old_obj.setName(new_obj.getName());
        old_obj.setEmail(new_obj.getEmail());
        old_obj.setPhone(new_obj.getPhone());
        old_obj.setPhotoUrl(new_obj.getPhotoUrl());
        old_obj.setActive(new_obj.getActive());
        return old_obj;
    }

    public void deleteByID(Long id){

        Optional<Barber> barber = barberRepository.findById(id);

        if (barber.isEmpty()) {
            throw new ResourceNotFoundException("Barber not found: " + id);
        }

        barberRepository.deleteById(id);
    }

}
