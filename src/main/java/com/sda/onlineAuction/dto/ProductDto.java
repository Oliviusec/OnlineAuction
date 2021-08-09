package com.sda.onlineAuction.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.Date;
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
