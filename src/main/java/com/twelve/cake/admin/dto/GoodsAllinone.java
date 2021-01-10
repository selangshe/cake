package com.twelve.cake.admin.dto;

import com.twelve.cake.db.entity.TwelveGoods;
import com.twelve.cake.db.entity.TwelveGoodsAttribute;
import com.twelve.cake.db.entity.TwelveGoodsProduct;
import com.twelve.cake.db.entity.TwelveGoodsSpecification;


public class GoodsAllinone {
    TwelveGoods goods;
    TwelveGoodsSpecification[] specifications;
    TwelveGoodsAttribute[] attributes;
    TwelveGoodsProduct[] products;

    public TwelveGoods getGoods() {
        return goods;
    }

    public void setGoods(TwelveGoods goods) {
        this.goods = goods;
    }

    public TwelveGoodsProduct[] getProducts() {
        return products;
    }

    public void setProducts(TwelveGoodsProduct[] products) {
        this.products = products;
    }

    public TwelveGoodsSpecification[] getSpecifications() {
        return specifications;
    }

    public void setSpecifications(TwelveGoodsSpecification[] specifications) {
        this.specifications = specifications;
    }

    public TwelveGoodsAttribute[] getAttributes() {
        return attributes;
    }

    public void setAttributes(TwelveGoodsAttribute[] attributes) {
        this.attributes = attributes;
    }

}
