package com.divya.expense_tracker_backend.controllers;

import com.divya.expense_tracker_backend.models.Expense;
import com.divya.expense_tracker_backend.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.Map;

@RestController
@RequestMapping("expense")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @PostMapping("")
    public String createExpense(@RequestBody Map<String, String> request) {
        String description = request.get("description");
        Double amount = Double.valueOf(request.get("amount"));
        Date date = Date.valueOf(request.get("date"));

        Expense exp = new Expense(description, amount, date);
        expenseRepository.save(exp);

        return "saved";
    }

    @GetMapping("")
    public @ResponseBody Iterable<Expense> getAllExpenses() {
        return expenseRepository.findAll();
    }
}
