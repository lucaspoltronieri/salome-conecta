package br.com.salome.conecta.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigInteger;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "CTE")
@Entity
public class Cte {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "NUMERO_CTE")
    private String numeroCte;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EMISSAO")
    private Date dataEmissao;

    @Column(name = "NUMEROS_NFE")
    private String numerosNfe;

    @Column(name = "REMETENTE_CNPJ")
    private String remetenteCnpj;

    @Column(name = "REMENTE_RAZAO_SOCIAL")
    private String rementeRazaoSocial;

    @Column(name = "CIDADE_ORIGEM")
    private String cidadeOrigem;

    @Column(name = "DESTINATARIO_CNPJ")
    private String destinatarioCnpj;

    @Column(name = "DESTINATARIO_RAZAO_SOCIAL")
    private String destinatarioRazaoSocial;

    @Column(name = "CIDADE_DESTINO")
    private String cidadeDestino;

    @Column(name = "TIPO_FRETE")
    private String tipoFrete;

    @Column(name = "QUANTIDADE_VOLUMES", precision = 19)
    private BigInteger quantidadeVolumes;

    @Column(name = "PESO")
    private Double peso;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ENTREGA")
    private Date dataEntrega;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "COMPROVANTE_ENTREGA", length = 1024)
    private FileRef comprovanteEntrega;

    @CreatedBy
    @Column(name = "CREATED_BY")
    private String createdBy;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private OffsetDateTime createdDate;

    @LastModifiedBy
    @Column(name = "LAST_MODIFIED_BY")
    private String lastModifiedBy;

    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private OffsetDateTime lastModifiedDate;

    public FileRef getComprovanteEntrega() {
        return comprovanteEntrega;
    }

    public void setComprovanteEntrega(FileRef comprovanteEntrega) {
        this.comprovanteEntrega = comprovanteEntrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public BigInteger getQuantidadeVolumes() {
        return quantidadeVolumes;
    }

    public void setQuantidadeVolumes(BigInteger quantidadeVolumes) {
        this.quantidadeVolumes = quantidadeVolumes;
    }

    public String getTipoFrete() {
        return tipoFrete;
    }

    public void setTipoFrete(String tipoFrete) {
        this.tipoFrete = tipoFrete;
    }

    public String getCidadeDestino() {
        return cidadeDestino;
    }

    public void setCidadeDestino(String cidadeDestino) {
        this.cidadeDestino = cidadeDestino;
    }

    public String getDestinatarioRazaoSocial() {
        return destinatarioRazaoSocial;
    }

    public void setDestinatarioRazaoSocial(String destinatarioRazaoSocial) {
        this.destinatarioRazaoSocial = destinatarioRazaoSocial;
    }

    public String getDestinatarioCnpj() {
        return destinatarioCnpj;
    }

    public void setDestinatarioCnpj(String destinatarioCnpj) {
        this.destinatarioCnpj = destinatarioCnpj;
    }

    public String getCidadeOrigem() {
        return cidadeOrigem;
    }

    public void setCidadeOrigem(String cidadeOrigem) {
        this.cidadeOrigem = cidadeOrigem;
    }

    public String getRementeRazaoSocial() {
        return rementeRazaoSocial;
    }

    public void setRementeRazaoSocial(String rementeRazaoSocial) {
        this.rementeRazaoSocial = rementeRazaoSocial;
    }

    public String getRemetenteCnpj() {
        return remetenteCnpj;
    }

    public void setRemetenteCnpj(String remetenteCnpj) {
        this.remetenteCnpj = remetenteCnpj;
    }

    public String getNumerosNfe() {
        return numerosNfe;
    }

    public void setNumerosNfe(String numerosNfe) {
        this.numerosNfe = numerosNfe;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNumeroCte() {
        return numeroCte;
    }

    public void setNumeroCte(String numeroCte) {
        this.numeroCte = numeroCte;
    }

    public OffsetDateTime getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public OffsetDateTime getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(OffsetDateTime createdDate) {
        this.createdDate = createdDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

}