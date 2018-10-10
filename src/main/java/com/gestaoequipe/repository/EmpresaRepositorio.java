package com.gestaoequipe.repository;

import com.gestaoequipe.entity.Empresa;
import org.springframework.data.repository.CrudRepository;

public interface EmpresaRepositorio extends CrudRepository<Empresa, Long> {

}
