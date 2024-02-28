package org.kbns.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class HomeVO {

    private String cardId, custId, cardSeCd, cardKndCd, cardBrandCd;
}