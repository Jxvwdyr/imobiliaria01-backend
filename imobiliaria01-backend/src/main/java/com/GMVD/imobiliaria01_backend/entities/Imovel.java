package com.GMVD.imobiliaria01_backend.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "imoveis")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Imovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private String descricao;

    @Column(nullable = false)
    private Double preco;

    private Integer quartos;

    // --- Adicao N01 de Campos

    private Double areaTotal;

    private String endereco;

    private String bairro;

    private String Cidade;

    // Status para dizer se está disponível, vendido ou alugado
    private String status;
}
