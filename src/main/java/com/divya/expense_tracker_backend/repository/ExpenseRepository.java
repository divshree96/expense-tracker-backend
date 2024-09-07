package com.divya.expense_tracker_backend.repository;

import com.divya.expense_tracker_backend.models.Expense;
import org.springframework.data.repository.CrudRepository;

public interface ExpenseRepository extends CrudRepository<Expense, Long> {
}
