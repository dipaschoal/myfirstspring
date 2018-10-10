package com.gestaoequipe.controller;

import com.gestaoequipe.entity.Empresa;
import com.gestaoequipe.repository.EmpresaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping(path = "/empresa")
public class EmpresaController {

    @Autowired
    private EmpresaRepositorio empresaRepositorio;

    @GetMapping("/all")
    public @ResponseBody
    Iterable<Empresa> getAllEmpresas() {
        return empresaRepositorio.findAll();
    }
}
