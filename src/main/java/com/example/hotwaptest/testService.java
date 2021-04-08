package com.example.hotwaptest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service("testserv")
public class testService {

    @Autowired
    TEstRepo tEstRepo;

    @Autowired
    TEstRepo2 tEstRepo2;

    @Autowired
    testService testService;

    @Transactional
    public String save() {
        tEstRepo2.save(new Entti2(3,"test2"));
        return testService.saveNested();
    }


    @Transactional(propagation = Propagation.NESTED)
    public String saveNested() {
//        throw new RuntimeException();
        return tEstRepo.save(new TEstEntity(669,"test")).getName();
    }


}
