package com.company.ht10.library;

import java.util.ArrayList;
import java.util.List;

public class FindByPageCount implements Findable {
    private int pageCount;

    public FindByPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    @Override
    public List<PrintedEditions> find(List<PrintedEditions> units) {
        List<PrintedEditions> resultUnits = new ArrayList<>();

        for(int i = 0; i < units.size(); i++) {
            PrintedEditions obj = units.get(i);
            if (pageCount == obj.getPageCount()) {
                resultUnits.add(obj);
            }
        }
        return resultUnits;
    }
}
