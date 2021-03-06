package com.sagittarius.bean.query;

public enum AggregationType {
    MIN("MIN"), MAX("MAX"), AVG("AVG"), SUM("SUM"), COUNT("COUNT");

    private String _name;
    AggregationType(String name){
        this._name = name;
    }

    public String toString(){
        return this._name;
    }
}
