package com.example.library_management_system.service.impl;

import com.example.library_management_system.entity.Transaction;
import com.example.library_management_system.repository.TransactionRepository;
import com.example.library_management_system.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionRepository repository;

    public List<Transaction> getAllTransactions() {
        return repository.findAll();
    }

    public Transaction getTransactionById(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void saveTransaction(Transaction transaction) {
        repository.save(transaction);
    }

    public List<Transaction> getUserTransactions(Long userId) {
        return repository.findByUserId(userId);
    }

    public List<Transaction> getOverdueTransactions() {
        return repository.findByStatus("OVERDUE");
    }
}