package com.lab7.demo.Service.impl;

import com.lab7.demo.Models.Brand;
import com.lab7.demo.Models.Os;
import com.lab7.demo.Repository.OsRepository;
import com.lab7.demo.Service.OsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OsServiceImpl implements OsService {

    private final OsRepository osRepository;

    public OsServiceImpl(OsRepository osRepository) {
        this.osRepository = osRepository;
    }

    @Override
    public List<Os> getAll() {
        return osRepository.findAll();
    }

    @Override
    public Os addOrReturn(Os os) {
        Os osInDb = osRepository.findByName(os.getName());

        if (osInDb == null) {
            return osRepository.save(os);
        }

        return osInDb;
    }
}
