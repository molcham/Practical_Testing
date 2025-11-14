package sample.cafekiosk.unit.beverage;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;


public class AmericanoTest {

    @Test
    void getName(){
        Americano americano = new Americano();

        //JUnit Api
        //assertEquals( americano.getName(), "아메리카노");

        /*
        assertj 문법 , 조금 더 명시적 , 테스트 결과 "아메리카노"라는 값을 기대함
        */
        assertThat(americano.getName()).isEqualTo("아메리카노");

    }

    @Test
    void getPrice(){
        Americano americano = new Americano();

        assertThat(americano.getPrice()).isEqualTo(4000);
    }
}
