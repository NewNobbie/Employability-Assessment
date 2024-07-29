package com.riwi.final_assessment.Domain;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Date;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "coupon")
public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private int id;
    private boolean Status;
    private int DiscountPercent;
    private Date DateTime;

    //@JsonManagedReference
    //@OneToMany(mappedBy = "coupon", cascade = CascadeType.ALL, orphanRemoval = true)
    //private List<Product> productList;


}
