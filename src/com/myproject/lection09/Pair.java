package com.myproject.lection09;

public class Pair <K, V> {
    private K pairKey;
    private V pairValue;

    Pair(){
    }

    Pair (K pairKey, V pairValue) {
        this.pairKey = pairKey;
        this.pairValue = pairValue;

    }

    public K getPairKey() {
        return pairKey;
    }

    public void setPairKey(K pairKey) {
        this.pairKey = pairKey;
    }

    public V getPairValue() {
        return pairValue;
    }

    public void setPairValue(V pairValue) {
        this.pairValue = pairValue;
    }


}


