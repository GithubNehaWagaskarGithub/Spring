package com.MVCDesignPattern.SpringMVCPattern.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Store {

    private int pId;
    private String pName;
    private double pPrice;
    private int pUnit;
    private double reVenue;
}
