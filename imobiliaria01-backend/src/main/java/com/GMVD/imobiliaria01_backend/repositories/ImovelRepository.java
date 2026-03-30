package com.GMVD.imobiliaria01_backend.repositories;

import com.GMVD.imobiliaria01_backend.entities.Imovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}
