package sample.cafekiosk.unit.order;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import sample.cafekiosk.unit.beverage.Beverage;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@RequiredArgsConstructor
public class Order {

    // 2개 인자 전달 필요
    private final LocalDateTime orderDateTime;
    private final List<Beverage> beverages;
}
