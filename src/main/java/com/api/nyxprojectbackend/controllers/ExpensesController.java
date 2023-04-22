package com.api.nyxprojectbackend.controllers;

import com.api.nyxprojectbackend.models.ExpensesModel;
import com.api.nyxprojectbackend.services.ExpensesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/expenses")
public class ExpensesController {
    final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @GetMapping("")
    public ResponseEntity<Page<ExpensesModel>> getAllExpenses(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findAll(pageable));
    }

    @GetMapping("/month/{month}")
    public ResponseEntity<Page<ExpensesModel>> getExpensesByMonth(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                  @PathVariable(value = "month") int mesMovimentacao) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findByMonth(pageable, mesMovimentacao));
    }

    @GetMapping("/category/{category}")
    public ResponseEntity<Page<ExpensesModel>> getExpensesByCategory(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                     @PathVariable(value = "category") int categoriaEconomicaCodigo) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findByCategory(pageable, categoriaEconomicaCodigo));
    }

    @GetMapping("/source/{source}")
    public ResponseEntity<Page<ExpensesModel>> getExpensesBySource(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                     @PathVariable(value = "source") int fonteRecursoCodigo) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findBySource(pageable, fonteRecursoCodigo));
    }
}
