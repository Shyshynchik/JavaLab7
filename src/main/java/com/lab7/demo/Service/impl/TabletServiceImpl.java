package com.lab7.demo.Service.impl;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Models.Os;
import com.lab7.demo.Models.Tablet;
import com.lab7.demo.Repository.TabletRepository;
import com.lab7.demo.Service.BrandService;
import com.lab7.demo.Service.OsService;
import com.lab7.demo.Service.TabletService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TabletServiceImpl implements TabletService {

    private final TabletRepository tabletRepository;
    private final BrandService brandService;
    private final OsService osService;

    public TabletServiceImpl(TabletRepository tabletRepository, BrandService brandService, OsService osService) {
        this.tabletRepository = tabletRepository;
        this.brandService = brandService;
        this.osService = osService;
    }

    @Override
    public List<Tablet> getAll() {
        return tabletRepository.findAll();
    }

    @Override
    public Tablet add(Tablet tablet) {
        Os os = osService.addOrReturn(tablet.getOs());
        tablet.setOs(os);

        Brand brand = brandService.addOrReturn(tablet.getBrand());
        tablet.setBrand(brand);

        return tabletRepository.save(tablet);
    }

    @Override
    public List<Tablet> getByBrand(Brand brand) {
        return tabletRepository.findByBrand(brand);
    }
}
