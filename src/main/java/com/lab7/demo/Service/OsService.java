package com.lab7.demo.Service;

import com.lab7.demo.Models.Os;

import java.util.List;

public interface OsService {

    List<Os> getAll();

    Os addOrReturn(Os os);

}
