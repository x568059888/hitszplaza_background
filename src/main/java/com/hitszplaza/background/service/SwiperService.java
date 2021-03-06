package com.hitszplaza.background.service;

import com.hitszplaza.background.pojo.Swiper;
import org.json.JSONObject;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface SwiperService {
    JSONObject uploadSwiper(MultipartFile originalSwiper);
    List<Swiper> find(Integer currStatus);
    JSONObject findBySwiperId(Integer id);
    Integer add(Swiper swiper);
    Integer update(Swiper swiper);
    Boolean delete(Integer swiperId);
}
