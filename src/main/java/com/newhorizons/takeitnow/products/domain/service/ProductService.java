package com.newhorizons.takeitnow.products.domain.service;

import com.newhorizons.takeitnow.products.application.mainmodule.dto.ProductDto;
import com.newhorizons.takeitnow.products.application.mainmodule.service.IProductService;
import com.newhorizons.takeitnow.products.domain.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

 @Autowired
    private IProductRepository productRepository;

    public List<ProductDto> getAll() {

        return productRepository.getAll();
    }


    public Optional<ProductDto> getProduct(long productId) {
        return productRepository.getProduct(productId);
    }
}
