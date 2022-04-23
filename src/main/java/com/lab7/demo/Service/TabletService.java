package com.lab7.demo.Service;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Models.Tablet;

import java.util.List;

public interface TabletService {

    List<Tablet> getAll();

    Tablet add(Tablet tablet);

    List<Tablet> getByBrand(Brand brand);

}
