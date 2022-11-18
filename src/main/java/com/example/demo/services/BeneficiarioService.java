package com.example.demo.services;

import com.example.demo.models.BeneficiarioModel;
import com.example.demo.repositories.BeneficiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class BeneficiarioService {
    @Autowired
    BeneficiarioRepository beneficiarioRepository;

    public ArrayList<BeneficiarioModel> getBeneficiarios(){
        return (ArrayList<BeneficiarioModel>)beneficiarioRepository.findAll();
    }

    public BeneficiarioModel postBeneficiario(BeneficiarioModel beneficiario){
        return beneficiarioRepository.save(beneficiario);
    }

    public Optional<BeneficiarioModel> getById(Integer id) {
        return beneficiarioRepository.findById(id);
    }

    public boolean deleteBeneficiario(Integer id){
        try{
            beneficiarioRepository.deleteById(id);
            return true;
        }
        catch(Exception error)
        {
            return false;
        }
    }
}
