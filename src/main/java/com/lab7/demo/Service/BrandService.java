package com.lab7.demo.Service;

import com.lab7.demo.Models.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> getAll();

    Brand addOrReturn(Brand brand);

    void delete(Integer id);

    Brand getById(Integer id);

}
