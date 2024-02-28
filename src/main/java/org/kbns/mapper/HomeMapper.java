package org.kbns.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.kbns.domain.HomeVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface HomeMapper {
    public List<HomeVO> selectCard();
}