package edu.wctc.wholesale.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class WholesaleOrder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="order_id")
    private int id;

    @Column(name="purchase_order_num")
    private String num;

    private String terms;

    @ManyToOne
    @JoinColumn(name="customer_id")
    private Customer customerId;

    @ManyToOne
    @JoinColumn(name="product_id")
    private Product productId;

    @Column(name="purchase_date")
    private LocalDateTime purchaseDate;

    @Column(name="shipped_date")
    private LocalDateTime shippedDate;

}
