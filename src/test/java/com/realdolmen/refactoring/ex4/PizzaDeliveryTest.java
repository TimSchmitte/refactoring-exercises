package com.realdolmen.refactoring.ex4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PizzaDeliveryTest {
    @Test
    void numberOfLateDeliveriesLessThan5_RatingOne() {
        PizzaDelivery pizzaDelivery = new PizzaDelivery(1);
        int rating = pizzaDelivery.getRating();

        Assertions.assertThat(rating)
            .isEqualTo(1);
    }

    @Test
    void numberOfLateDeliveriesFiveOrLess_RatingOne() {
        PizzaDelivery pizzaDelivery = new PizzaDelivery(5);
        int rating = pizzaDelivery.getRating();

        Assertions.assertThat(rating)
            .isEqualTo(1);
    }


    @Test
    void numberOfLateDeliveriesMoreThan5_RatingTwo() {
        PizzaDelivery pizzaDelivery = new PizzaDelivery(6);
        int rating = pizzaDelivery.getRating();

        Assertions.assertThat(rating)
            .isEqualTo(2);
    }
}