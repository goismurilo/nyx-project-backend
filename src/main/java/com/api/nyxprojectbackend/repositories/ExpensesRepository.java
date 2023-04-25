package com.api.nyxprojectbackend.repositories;

import com.api.nyxprojectbackend.models.ExpensesModel;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

@Tag(name = "Expenses")
public interface ExpensesRepository extends JpaRepository<ExpensesModel, UUID> {

    Page<ExpensesModel> findByMesMovimentacao(Pageable pageable, int mesMovimentacao);

    Page<ExpensesModel> findByCategoriaEconomicaCodigo(Pageable pageable, int categoriaEconomicaCodigo);

    Page<ExpensesModel> findByFonteRecursoCodigo(Pageable pageable, int fonteRecursoCodigo);

    @Query(value = "SELECT SUM(valor_empenhado), SUM(valor_liquidado), SUM(valor_pago) FROM tb_expenses_recife",
    nativeQuery = true)
    List<Number[]> getTotalAmountExpenses();

    @Query(value = "SELECT COUNT(categoria_economica_codigo), categoria_economica_codigo, categoria_economica_nome, SUM(valor_empenhado), SUM(valor_liquidado), SUM(valor_pago)" +
            "FROM tb_expenses_recife  GROUP BY categoria_economica_codigo",
            nativeQuery = true)
    List<Object[]> getInfoCategories();

    @Query(value = "SELECT COUNT(fonte_recurso_codigo), fonte_recurso_codigo, fonte_recurso_nome, SUM(valor_empenhado), SUM(valor_liquidado), SUM(valor_pago)" +
            "FROM tb_expenses_recife  GROUP BY fonte_recurso_codigo",
            nativeQuery = true)
    List<Object[]> getInfoSource();
    @Query(value = "SELECT COUNT(mes_movimentacao), mes_movimentacao, CAST(mes_movimentacao AS VARCHAR(10)), SUM(valor_empenhado), SUM(valor_liquidado), SUM(valor_pago)" +
            "FROM tb_expenses_recife  GROUP BY mes_movimentacao",
            nativeQuery = true)
    List<Object[]> getInfoMonth();
}

