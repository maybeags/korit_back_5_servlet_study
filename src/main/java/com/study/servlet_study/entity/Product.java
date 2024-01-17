package com.study.servlet_study.entity;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Product {
	String productName;
	int price;
	String size;
	String color;
}
