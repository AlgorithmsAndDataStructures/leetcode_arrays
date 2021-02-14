package com.malmike.arrays.InsertingItemsIntoAnArray.DuplicateZeros;

import java.util.HashMap;
import java.util.Map;

public class DuplicateZerosSol2 {
    public void duplicateZeros(int[] arr){
        Map<String, Integer> lastItem = derivePositionOfLastItem(arr);
        int i = lastItem.get("length");
        int position = lastItem.get("position");
        while (i > position) {
            if (arr[position] == 0) {
                arr[i] = 0;
                i--;
            }
            arr[i] = arr[position];
            i--;
            position--;
        }
    }

    private Map<String, Integer> derivePositionOfLastItem(int[] arr) {
        int position = 0, i = 0;
        int length = arr.length;
        while (i < length) {
            if (arr[position] == 0) {
                if (i == arr.length - 1) {
                    arr[arr.length - 1] = 0;
                    length -= 1;
                    break;
                } else
                    i++;
            }
            position++;
            i++;
        }
        Map<String, Integer> values = new HashMap<String, Integer>();
        values.put("length", length - 1);
        values.put("position", position - 1);
        return values;
    }
}
