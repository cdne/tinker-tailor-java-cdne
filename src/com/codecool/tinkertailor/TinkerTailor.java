package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List execute() {
        ArrayList<Integer> numbers = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        int indexToBeRemoved = 0;

        for(int i = 1; i <= n;i++){
            numbers.add(i);
        }

        while(numbers.size() > 1){
            indexToBeRemoved = (indexToBeRemoved + k - 1) % numbers.size();
            result.add(numbers.remove(indexToBeRemoved));
        }
        int lastNumbersElement = numbers.get(0);
        result.add(lastNumbersElement);
        return result;
    }
}