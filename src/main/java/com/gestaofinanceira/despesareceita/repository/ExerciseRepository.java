package com.gestaofinanceira.despesareceita.repository;

import com.gestaofinanceira.despesareceita.domainGestao.Exercise;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends JpaRepository <Exercise, Long>{
}
