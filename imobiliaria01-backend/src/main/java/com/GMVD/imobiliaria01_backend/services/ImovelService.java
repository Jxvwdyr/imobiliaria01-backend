package com.GMVD.imobiliaria01_backend.services;

import com.GMVD.imobiliaria01_backend.entities.Imovel;
import com.GMVD.imobiliaria01_backend.repositories.ImovelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImovelService {

    private final ImovelRepository repository;

    //Construtor para o Spring injetar o Repository aqui dentro
    public ImovelService(ImovelRepository repository) {
        this.repository = repository;
    }

    //Metodo para salvar um imovel novo
    public Imovel salvar(Imovel imovel) {
        // Aqui no futuro a gente pode colocar regras tipo: "se o preço for menor que 0, dê erro"
        return repository.save(imovel);
    }

    //Metodo para listar todos os imoveis
    public List<Imovel> listarTodos() {
        return repository.findAll();
    }
}
