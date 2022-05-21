package com.micronaut.products;

import java.math.BigDecimal;
import java.util.Currency;

public record Money(Currency currency, BigDecimal value) {

    Money(BigDecimal value) {
        this(Currency.getInstance("USD"), value);
    }

}
