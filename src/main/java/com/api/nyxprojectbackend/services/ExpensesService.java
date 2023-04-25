package com.api.nyxprojectbackend.services;

import com.api.nyxprojectbackend.models.ExpensesModel;
import com.api.nyxprojectbackend.repositories.ExpensesRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpensesService {
    final ExpensesRepository expensesRepository;

    public ExpensesService(ExpensesRepository expensesRepository) {
        this.expensesRepository = expensesRepository;
    }

    public Page<ExpensesModel> findAll(Pageable pageable) {
        return expensesRepository.findAll(pageable);
    }

    public Page<ExpensesModel> findByMonth(Pageable pageable, int mesMovimentacao) {
        return expensesRepository.findByMesMovimentacao(pageable, mesMovimentacao);
    }

    public Page<ExpensesModel> findByCategory(Pageable pageable, int categoriaEconomicaCodigo) {
        return expensesRepository.findByCategoriaEconomicaCodigo(pageable, categoriaEconomicaCodigo);
    }

    public Page<ExpensesModel> findBySource(Pageable pageable, int fonteRecursoCodigo) {
        return expensesRepository.findByFonteRecursoCodigo(pageable, fonteRecursoCodigo);
    }

    public Page<ExpensesModel> findBySources(Pageable pageable, int fonteRecursoCodigo) {
        return expensesRepository.findByFonteRecursoCodigo(pageable, fonteRecursoCodigo);
    }

    public List<Number[]> getTotalAmount() {
        return expensesRepository.getTotalAmountExpenses();
    }

    public List<Object[]> getInfoCategories() {
        return expensesRepository.getInfoCategories();
    }

    public List<Object[]> getInfoSource() {
        return expensesRepository.getInfoSource();
    }

    public List<Object[]> getInfoMonth() {
        return expensesRepository.getInfoMonth();
    }
}
