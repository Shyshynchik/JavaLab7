package com.lab7.demo.Service.impl;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Repository.BrandRepository;
import com.lab7.demo.Service.BrandService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BrandServiceImpl implements BrandService {

    private final BrandRepository brandRepository;

    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> getAll() {
        return brandRepository.findAll();
    }

    @Override
    public Brand addOrReturn(Brand brand) {
        Brand brandInDb = brandRepository.findByName(brand.getName());

        if (brandInDb == null) {
            return brandRepository.save(brand);
        }

        return brandInDb;
    }

    @Override
    public void delete(Integer id) {
        Brand brand = brandRepository.findById(id).get();
        brandRepository.delete(brand);
    }

    @Override
    public Brand getById(Integer id) {
        return brandRepository.findById(id).get();
    }

}
