package com.sda.onilneAuction.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
public class ProductDto {

    private String name;
    private String description;
    private String startBiddingPrice;
    private String category;
    private String endDateTime;


}
