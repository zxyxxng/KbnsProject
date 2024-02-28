package org.kbns.service.impl;

import org.kbns.domain.HomeVO;
import org.kbns.mapper.HomeMapper;
import org.kbns.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Autowired
    private HomeMapper mapper;

    @Override
    public List<HomeVO> getCardInfo() {
        return mapper.selectCard();
    }

}