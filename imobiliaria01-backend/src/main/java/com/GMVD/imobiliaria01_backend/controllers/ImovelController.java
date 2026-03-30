package com.GMVD.imobiliaria01_backend.controllers;

import com.GMVD.imobiliaria01_backend.entities.Imovel;
import com.GMVD.imobiliaria01_backend.services.ImovelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/imoveis")
public class ImovelController {

    private ImovelService service;

    public ImovelController(ImovelService service) {
        this.service = service;
    }

    @PostMapping
    public Imovel salvar(@RequestBody Imovel imovel) {
        return service.salvar(imovel);
    }

    @GetMapping
    public List<Imovel> listarTodos() {
        return service.listarTodos();
    }
}
