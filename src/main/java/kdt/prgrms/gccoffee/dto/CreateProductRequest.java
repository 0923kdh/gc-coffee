package kdt.prgrms.gccoffee.dto;

import kdt.prgrms.gccoffee.model.Category;

public record CreateProductRequest(String productName, Category category, long price, String description){
}
