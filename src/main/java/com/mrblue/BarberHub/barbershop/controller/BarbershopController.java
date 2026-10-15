package com.mrblue.BarberHub.barbershop.controller;

import com.mrblue.BarberHub.barbershop.entity.Barbershop;
import com.mrblue.BarberHub.barbershop.service.BarbershopService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/barbershops")
public class BarbershopController {
    final BarbershopService barbershopService;

    public BarbershopController(BarbershopService barbershopService) {
        this.barbershopService = barbershopService;
    }

    @PostMapping
    ResponseEntity<Barbershop> insert(@RequestBody Barbershop barbershop){
        barbershop = barbershopService.insert(barbershop);
        return ResponseEntity.status(HttpStatus.CREATED).body(barbershop);
    }

    @GetMapping("/{id}")
    ResponseEntity<Barbershop> findByID(@PathVariable Long id){
        Barbershop barbershop = barbershopService.findByID(id);
        return ResponseEntity.ok(barbershop);
    }

    @GetMapping()
    ResponseEntity<List<Barbershop>> findAll(){
        List<Barbershop> barbershops = barbershopService.findAll();
        return ResponseEntity.ok(barbershops);
    }

    @PutMapping("/{id}")
    ResponseEntity<Barbershop> update(@PathVariable Long id, @RequestBody Barbershop obj){
        Barbershop barbershop = barbershopService.findByID(id);

        Barbershop updatedAccount = barbershopService.update(barbershop, obj);

        return ResponseEntity.ok(updatedAccount);
    }

    @DeleteMapping("/{id}")
    ResponseEntity<Void> delete(@PathVariable Long id){

        barbershopService.findByID(id);

        barbershopService.deleteByID(id);
        return ResponseEntity.noContent().build();
    }

}
