package com.company.ht10.library;

import java.util.Objects;

public class PrintedEditions {
    private String title;
    private int pageCount;
    private double price;

    public PrintedEditions(String title, int pageCount, int price) {
        this.title = title;
        this.pageCount = pageCount;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public double getPrice() {
        return price;
    }

    public void print() {
        System.out.print(this.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrintedEditions that = (PrintedEditions) o;
        return pageCount == that.pageCount &&
                price == that.price &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {

        return Objects.hash(title, pageCount, price);
    }

    @Override
    public String toString() {
        return  "title='" + title + '\'' +
                "\tpageCount=" + pageCount +
                "\tprice=" + price;
    }
}
