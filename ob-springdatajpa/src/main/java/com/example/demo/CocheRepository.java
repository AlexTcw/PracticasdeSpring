package com.example.demo;

import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.*;

@Repository
public interface CocheRepository extends JpaRepository<Coche, Long> {
}
