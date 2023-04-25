package com.api.nyxprojectbackend.controllers;

import com.api.nyxprojectbackend.models.ExpensesModel;
import com.api.nyxprojectbackend.models.RequestInfoModel;
import com.api.nyxprojectbackend.models.ResponseInfoModel;
import com.api.nyxprojectbackend.services.ExpensesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
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
@Tag(name = "Expenses")
public class ExpensesController {
    final ExpensesService expensesService;

    public ExpensesController(ExpensesService expensesService) {
        this.expensesService = expensesService;
    }

    @GetMapping("")
    @Operation(summary = "Lista todas as despesas de Recife em 2017", method = "GET")
    public ResponseEntity<Page<ExpensesModel>> getAllExpenses(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC)Pageable pageable) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findAll(pageable));
    }

    @GetMapping("/amount")
    @Operation(summary = "Lista a soma das despesas líquidas, empenhadas e pagas.", method = "GET")
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
    @Operation(summary = "Lista todas as despesas por mês.", method = "GET")
    public ResponseEntity<Page<ExpensesModel>> getExpensesByMonth(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                  @PathVariable(value = "month") int mesMovimentacao) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findByMonth(pageable, mesMovimentacao));
    }

    @GetMapping("/category/{category}")
    @Operation(summary = "Lista todas as despesas por categoria.", method = "GET")
    public ResponseEntity<Page<ExpensesModel>> getExpensesByCategory(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                     @PathVariable(value = "category") int categoriaEconomicaCodigo) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findByCategory(pageable, categoriaEconomicaCodigo));
    }

    @GetMapping("/source/{source}")
    @Operation(summary = "Lista todas as despesas por Fonte de Recurso.", method = "GET")
    public ResponseEntity<Page<ExpensesModel>> getExpensesBySource(@PageableDefault(page = 0, size = 10, sort = "id", direction = Sort.Direction.ASC) Pageable pageable,
                                                                   @PathVariable(value = "source") int fonteRecursoCodigo) {
        return ResponseEntity.status(HttpStatus.OK).body(expensesService.findBySource(pageable, fonteRecursoCodigo));
    }

    @GetMapping("/info")
    @Operation(summary = "Lista informações gerais a partir de mês, categoria ou fonte de recurso", method = "GET")
    public ResponseEntity<List<ResponseInfoModel>> getInfoCategories(RequestInfoModel params) {
        List<Object[]> result;

        if (params.getName().equals("month")) {
            result = expensesService.getInfoMonth();
        } else if (params.getName().equals("category")) {
            result = expensesService.getInfoCategories();
        } else {
//      } else if (params.getName().equals("source")) {
            result = expensesService.getInfoSource();
        }

        List<ResponseInfoModel> response = new ArrayList<>();

        for(Object[] info: result) {
            ResponseInfoModel item = new ResponseInfoModel(
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
}
