package com.devsuperior.dsvendas.services;

import com.devsuperior.dsvendas.dto.SellerDTO;
import com.devsuperior.dsvendas.entities.Seller;
import com.devsuperior.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SellerService {

    @Autowired
    private SellerRepository repository;

    @Transactional(readOnly = true)
    public List<SellerDTO> findAll() {
        List<Seller> sellers = repository.findAll();
        return sellers.stream().map(SellerDTO::new).collect(Collectors.toList());
    }
}
