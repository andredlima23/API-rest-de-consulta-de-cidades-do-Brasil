package com.github.andredlima23.cidadesapi.staties.repositories;

import com.github.andredlima23.cidadesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
