package com.api.nyxprojectbackend.controllers;

import com.api.nyxprojectbackend.models.ExpensesModel;
import com.api.nyxprojectbackend.models.ResponseInfo;
import com.api.nyxprojectbackend.services.ExpensesService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.*;

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

    @GetMapping("/amount")
    public ResponseEntity<Object> getTotalAmountExpenses() {
        var result = expensesService.getTotalAmount();

        Map<String, Number> response = new HashMap<>();

        for(Number[] info: result) {
            response.put("pledged", info[0]);
            response.put("paidOff", info[1]);
            response.put("paid", info[2]);
        }

        return ResponseEntity.status(HttpStatus.OK).body(response);
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

    @GetMapping("/category/info")
    public ResponseEntity<List<ResponseInfo>> getInfoCategories() {
        var result = expensesService.getInfoCategories();

        List<ResponseInfo> response = new ArrayList<>();

        for(Object[] info: result) {
            ResponseInfo item = new ResponseInfo(
                    (Long) info[0],
                    (Integer) info[1],
                    (String) info[2],
                    (BigDecimal) info[3],
                    (BigDecimal) info[4],
                    (BigDecimal) info[5]
            );
            response.add(item);
        }

        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @GetMapping("/source/{source}")
    public ResponseEntity<Page<ExpensesModel>> getExpensesBySource(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                   @PathVariable(value = "source") int fonteRecursoCodigo) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findBySource(pageable, fonteRecursoCodigo));
    }
}
