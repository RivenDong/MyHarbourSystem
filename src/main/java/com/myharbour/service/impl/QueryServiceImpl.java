package com.myharbour.service.impl;

import com.myharbour.pojo.Container;
import com.myharbour.service.QueryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class QueryServiceImpl implements QueryService{


    @Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.SERIALIZABLE)
    @Override
    public List<Container> getContainersBySpecificParas(Integer size, Integer type, Integer area, int page) {

        return null;
    }
}
