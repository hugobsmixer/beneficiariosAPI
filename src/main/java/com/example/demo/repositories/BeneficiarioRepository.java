package com.example.demo.repositories;

import com.example.demo.models.BeneficiarioModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BeneficiarioRepository extends CrudRepository<BeneficiarioModel, Integer> {
}
