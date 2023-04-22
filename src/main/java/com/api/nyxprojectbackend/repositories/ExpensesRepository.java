package com.api.nyxprojectbackend.repositories;

import com.api.nyxprojectbackend.models.ExpensesModel;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExpensesRepository extends JpaRepository<ExpensesModel, UUID> {

    Page<ExpensesModel> findByMesMovimentacao(Pageable pageable, int mesMovimentacao);

    Page<ExpensesModel> findByCategoriaEconomicaCodigo(Pageable pageable, int categoriaEconomicaCodigo);

    Page<ExpensesModel> findByFonteRecursoCodigo(Pageable pageable, int fonteRecursoCodigo);
}
