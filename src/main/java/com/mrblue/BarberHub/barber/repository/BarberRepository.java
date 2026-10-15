package com.mrblue.BarberHub.barber.repository;

import com.mrblue.BarberHub.barber.entity.Barber;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BarberRepository extends JpaRepository<Barber, Long> {
}
