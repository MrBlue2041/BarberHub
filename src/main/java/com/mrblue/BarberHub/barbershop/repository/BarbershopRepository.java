package com.mrblue.BarberHub.barbershop.repository;

import com.mrblue.BarberHub.barbershop.entity.Barbershop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarbershopRepository extends JpaRepository<Barbershop, Long> {
}
