package com.mrblue.BarberHub.barber.controller;
import com.mrblue.BarberHub.barber.entity.Barber;
import com.mrblue.BarberHub.barber.service.BarberService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping(path = "/barbers")
public class BarberController {
    final BarberService barberService;

    public BarberController(BarberService barberService) {
        this.barberService = barberService;
    }

    @PostMapping
    public ResponseEntity<Barber> insert(@RequestBody Barber obj){
        obj = barberService.insert(obj);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Barber> findByID(@PathVariable Long id){

        Barber obj = barberService.findByID(id);

        return ResponseEntity.ok(obj);
    }

    @GetMapping
    public ResponseEntity<List<Barber>> findAll(){
        List<Barber> obj = barberService.findAll();
        return ResponseEntity.ok(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Barber> update(@PathVariable Long id, @RequestBody Barber obj){

        Barber barber = barberService.findByID(id);

        Barber updatedBarber = barberService.update(barber, obj);
        return ResponseEntity.ok(updatedBarber);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){

        barberService.findByID(id);

        barberService.deleteByID(id);
        return ResponseEntity.noContent().build();
    }

}
