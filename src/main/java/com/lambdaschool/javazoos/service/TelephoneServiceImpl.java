package com.lambdaschool.javazoos.service;

import com.lambdaschool.javazoos.repo.TelephoneRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "telephoneService")
public class TelephoneServiceImpl implements TelephoneService {
    @Autowired
    private TelephoneRepo telephonerepo;


}
