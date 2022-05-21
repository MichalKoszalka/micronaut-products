package com.micronaut.products;

import java.util.UUID;

class Product {

    final String id = UUID.randomUUID().toString();

    Money price;

    String name;

    final String partyId;

    Product(String partyId) {
        this.partyId = partyId;
    }

}
