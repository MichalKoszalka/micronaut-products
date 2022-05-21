package com.micronaut.products;

import io.micronaut.http.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@Controller("/products")
public class ProductsListingController {

    private final ProductsRepository productsRepository;

    ProductsListingController(ProductsRepository productsRepository) {
        this.productsRepository = productsRepository;
    }

    @Get
    public List<ProductsVO> getAllProductsByParty(@QueryValue String partyId) {
        return productsRepository.findAllByPartyId(partyId).stream().map(product -> new ProductsVO(product.name, product.price)).collect(Collectors.toList());
    }

//    @Post
//    public List<ProductsVO> getAllProductsByParty(@Body ProductDraft partyId) {
//        return productsRepository.findAllByPartyId(partyId).stream().map(product -> new ProductsVO(product.name, product.price)).collect(Collectors.toList());
//    }

}
