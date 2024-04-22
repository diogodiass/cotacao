package org.br.mineracao.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "quotation")
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@NoArgsConstructor
public class QuotationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @Column(name = "currency_price")
    private BigDecimal currencyPrice;
    @Column(name = "pct_change")
    private String pctChange;
    private String pair;

}
