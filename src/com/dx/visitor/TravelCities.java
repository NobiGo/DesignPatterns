package com.dx.visitor;

public class TravelCities implements City{
    City[] cities;

    public TravelCities() {
       cities = new City[]{new BeiJing(),new ShangHai(),new ShenZhen()};
    }

    @Override
    public void accept(Visitor visitor){
        for(City city: cities){
            city.accept(visitor);
        }
    }
}
