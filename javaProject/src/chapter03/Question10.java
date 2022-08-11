package chapter03;

import java.util.HashMap;

public class Question10 {

    private enum CoffeeType {AMERICANO, ICE_AMERICANO, CAFFELATE};

    static void printCoffeePrice(CoffeeType coffeeType) {
        HashMap<CoffeeType, Integer> priceMap = new HashMap<>();
        priceMap.put(CoffeeType.AMERICANO, 3000);
        priceMap.put(CoffeeType.ICE_AMERICANO, 4000);
        priceMap.put(CoffeeType.CAFFELATE, 5000);
        int coffeePrice = priceMap.get(coffeeType);
        System.out.println(String.format("가격은 %d원 입니다.", coffeePrice));
    }

    public static void main(String[] args) {
        printCoffeePrice(CoffeeType.AMERICANO);
    }
}
