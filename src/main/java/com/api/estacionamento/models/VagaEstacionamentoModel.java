package com.api.estacionamento.models;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_VAGA_ESTACIONAMENTO")
public class VagaEstacionamentoModel implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 10)
    private String numeroVaga;
    @Column(nullable = false, unique = true, length = 7)
    private String placaCarro;
    @Column(nullable = false, length = 70)
    private String marcaCarro;
    @Column(nullable = false, length = 70)
    private String modeloCarro;
    @Column(nullable = false, length = 70)
    private String corCarro;
    @Column(nullable = false)
    private LocalDateTime registrationDate;
    @Column(nullable = false, length = 130)
    private String nomeResponsavel;
    @Column(nullable = false, length = 30)
    private String apartamento;
    @Column(nullable = false, length = 30)
    private String block;

    /**
     * @return UUID return the id
     */
    public UUID getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(UUID id) {
        this.id = id;
    }

    /**
     * @return String return the numeroVaga
     */
    public String getNumeroVaga() {
        return numeroVaga;
    }

    /**
     * @param numeroVaga the numeroVaga to set
     */
    public void setNumeroVaga(String numeroVaga) {
        this.numeroVaga = numeroVaga;
    }

    /**
     * @return String return the placaCarro
     */
    public String getPlacaCarro() {
        return placaCarro;
    }

    /**
     * @param placaCarro the placaCarro to set
     */
    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }

    /**
     * @return String return the marcaCarro
     */
    public String getMarcaCarro() {
        return marcaCarro;
    }

    /**
     * @param marcaCarro the marcaCarro to set
     */
    public void setMarcaCarro(String marcaCarro) {
        this.marcaCarro = marcaCarro;
    }

    /**
     * @return String return the modeloCarro
     */
    public String getModeloCarro() {
        return modeloCarro;
    }

    /**
     * @param modeloCarro the modeloCarro to set
     */
    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    /**
     * @return String return the corCarro
     */
    public String getCorCarro() {
        return corCarro;
    }

    /**
     * @param corCarro the corCarro to set
     */
    public void setCorCarro(String corCarro) {
        this.corCarro = corCarro;
    }

    /**
     * @return LocalDateTime return the registrationDate
     */
    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    /**
     * @param registrationDate the registrationDate to set
     */
    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    /**
     * @return String return the nomeResponsavel
     */
    public String getNomeResponsavel() {
        return nomeResponsavel;
    }

    /**
     * @param nomeResponsavel the nomeResponsavel to set
     */
    public void setNomeResponsavel(String nomeResponsavel) {
        this.nomeResponsavel = nomeResponsavel;
    }

    /**
     * @return String return the apartamento
     */
    public String getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    /**
     * @return String return the block
     */
    public String getBlock() {
        return block;
    }

    /**
     * @param block the block to set
     */
    public void setBlock(String block) {
        this.block = block;
    }

}
