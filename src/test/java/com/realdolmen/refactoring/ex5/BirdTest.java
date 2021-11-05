package com.realdolmen.refactoring.ex5;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class BirdTest {

    private final Pigeon pigeon = new Pigeon(10.0);

    @Test
    void eatOnce() {
        String food = "seeds";
        pigeon.ingest(food);

        Assertions.assertThat(pigeon.getStomachContents()).isEqualTo(food);

    }

    @Test
    void eatTwice_StomachFull() {
        pigeon.ingest("seeds");
        Assertions.assertThatThrownBy(() -> pigeon.ingest("worm"))
            .isInstanceOf(StomachFullException.class);
    }

    @Test
    void testDigest() {
        String food = "seeds";
        pigeon.ingest(food);

        pigeon.digest();
        Assertions.assertThat(pigeon.getStomachContents()).isNull();
    }

    @Test
    void digest_nothingToDigest() {
        Assertions.assertThatThrownBy(pigeon::digest)
            .isInstanceOf(NothingToDigestException.class);
    }

    @Test
    void fly() {
        pigeon.fly(10);

        Assertions.assertThat(pigeon.getKmFlown())
            .isEqualTo(10);

        pigeon.fly(52);

        Assertions.assertThat(pigeon.getKmFlown())
            .isEqualTo(62);

    }
}