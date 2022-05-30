package com.micronaut.products;

import java.util.UUID;

class Product {

    final String id = UUID.randomUUID().toString();

    Money price;

    String name;

    final String partyId;

    private Product(Money price, String name, String partyId) {
        this.price = price;
        this.name = name;
        this.partyId = partyId;
    }

    static Product fromDraft(ProductDraft draft) {
        return new Product(draft.price(), draft.name(), draft.partyId());
    }
}
