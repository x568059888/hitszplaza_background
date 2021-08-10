package com.hitszplaza.background.pojo;

import lombok.Data;

@Data
public class Swiper {
    private Integer swiperId;
    private String clickUrl;
    private String storageDir;
    private String info;
    private Integer currStatus;
    private Long startTime;
}
