package com.gestaoequipe.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "empresa")
public class Empresa {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idempresa;

    private String nomeempresa;

    public Long getIdempresa() {
        return idempresa;
    }

    public String getNomeempresa() {
        return nomeempresa;
    }

    public void setIdempresa(Long idempresa) {
        this.idempresa = idempresa;
    }

    public void setNomeempresa(String nomeempresa) {
        this.nomeempresa = nomeempresa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Empresa empresa = (Empresa) o;
        return Objects.equals(idempresa, empresa.idempresa) &&
                Objects.equals(nomeempresa, empresa.nomeempresa);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idempresa, nomeempresa);
    }
}
