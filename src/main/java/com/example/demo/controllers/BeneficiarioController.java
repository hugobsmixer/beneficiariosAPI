package com.example.demo.controllers;

import com.example.demo.models.BeneficiarioModel;
import com.example.demo.services.BeneficiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:8081")
@RequestMapping("/beneficiario")
public class BeneficiarioController {
    @Autowired
    BeneficiarioService beneficiarioService;

    @GetMapping()
    public ArrayList<BeneficiarioModel> listBeneficiarios(){
        return beneficiarioService.getBeneficiarios();
    }

    @PostMapping()
    public BeneficiarioModel guardarBeneficiario(@RequestBody BeneficiarioModel beneficiario){
        return this.beneficiarioService.postBeneficiario(beneficiario);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    @GetMapping( path = "/{id}")
    public Optional<BeneficiarioModel> obtenerBeneficiario(@PathVariable("id") Integer id){
        return this.beneficiarioService.getById(id);
    }

    @RequestMapping(method = RequestMethod.DELETE, path = "/{id}")
    @DeleteMapping( path = "/{id}")
    public String eliminarBeneficiario(@PathVariable("id") Integer id){
        boolean result = this.beneficiarioService.deleteBeneficiario(id);
        if(result){
            return "Se elimino el beneficiario " + id;
        }else{
            return "No se pudo eliminar el beneficiario " + id;
        }
    }
}
