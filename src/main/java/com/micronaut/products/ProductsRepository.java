package com.micronaut.products;

import jakarta.inject.Singleton;

import java.util.*;
import java.util.stream.Collectors;

@Singleton
public class ProductsRepository {

    private Map<String, Product> products = new HashMap<>();

    Product addProduct(Product product) {
        products.put(product.id, product);
        return product;
    }

    void removeProduct(Product product) {
        products.remove(product.id);
    }

    Optional<Product> findById(String id) {
        return Optional.ofNullable(products.get(id));
    }

    List<Product> findAllByPartyId(String partyId) {
        return products.values().stream().filter( product -> Objects.equals(product.partyId, partyId)).collect(Collectors.toList());
    }



}
