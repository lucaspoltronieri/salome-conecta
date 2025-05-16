package br.com.salome.conecta.entity;

import io.jmix.core.FileRef;
import io.jmix.core.entity.annotation.JmixGeneratedValue;
import io.jmix.core.metamodel.annotation.JmixEntity;
import jakarta.persistence.*;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Date;
import java.util.UUID;

@JmixEntity
@Table(name = "FATURA")
@Entity
public class Fatura {
    @JmixGeneratedValue
    @Column(name = "ID", nullable = false)
    @Id
    private UUID id;

    @Column(name = "STATUS_FATURA")
    private String statusFatura;

    @Column(name = "CLIENTE_CNPJ")
    private String clienteCnpj;

    @Column(name = "CLIENTE_RAZAO_SOCIAL")
    private String clienteRazaoSocial;

    @Column(name = "PDF_FATURA", length = 1024)
    private FileRef pdfFatura;

    @Column(name = "PDF_BOLETO", length = 1024)
    private FileRef pdfBoleto;

    @Column(name = "RELACAO_CTE")
    private String relacaoCte;

    @Column(name = "NUMERO_FATURA")
    private String numeroFatura;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_EMISSAO")
    private Date dataEmissao;

    @Temporal(TemporalType.DATE)
    @Column(name = "VENCIMENTO")
    private Date vencimento;

    @Column(name = "VALOR", precision = 19, scale = 2)
    private BigDecimal valor;

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

    public String getRelacaoCte() {
        return relacaoCte;
    }

    public void setRelacaoCte(String relacaoCte) {
        this.relacaoCte = relacaoCte;
    }

    public FileRef getPdfBoleto() {
        return pdfBoleto;
    }

    public void setPdfBoleto(FileRef pdfBoleto) {
        this.pdfBoleto = pdfBoleto;
    }

    public FileRef getPdfFatura() {
        return pdfFatura;
    }

    public void setPdfFatura(FileRef pdfFatura) {
        this.pdfFatura = pdfFatura;
    }

    public String getClienteRazaoSocial() {
        return clienteRazaoSocial;
    }

    public void setClienteRazaoSocial(String clienteRazaoSocial) {
        this.clienteRazaoSocial = clienteRazaoSocial;
    }

    public String getClienteCnpj() {
        return clienteCnpj;
    }

    public void setClienteCnpj(String clienteCnpj) {
        this.clienteCnpj = clienteCnpj;
    }

    public void setStatusFatura(String statusFatura) {
        this.statusFatura = statusFatura;
    }

    public String getStatusFatura() {
        return statusFatura;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNumeroFatura() {
        return numeroFatura;
    }

    public void setNumeroFatura(String numeroFatura) {
        this.numeroFatura = numeroFatura;
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