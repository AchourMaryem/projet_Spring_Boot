package com.example.projet_sem.Dao;

import com.example.projet_sem.Entity.B3;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface B3Repository extends JpaRepository <B3,Long> {
  //  Optional<B3> findByCin(String Cin);
}
