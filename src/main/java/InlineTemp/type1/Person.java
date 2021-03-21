package main.java.InlineTemp.type1;

public class Person {
    private Integer basePrice;

    public Integer getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(Integer basePrice) {
        this.basePrice = basePrice;
    }

//    public boolean isBiger(Person person){
//        Integer basePrice = person.getBasePrice();
//        return basePrice > 1000;
//    }
//                   | |
//                   | |
//                    V
    //当一个临时变量只被一个简单表达式赋值一次，而它妨碍了其他重构手法，那就重构它吧。
    public boolean isBiger(Person person){
        return person.getBasePrice() > 1000;
    }


}
