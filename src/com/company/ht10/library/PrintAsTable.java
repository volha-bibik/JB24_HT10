package com.company.ht10.library;

import com.company.ht9.Magazine;

import java.time.Period;
import java.util.List;

public class PrintAsTable implements Printable{
    @Override
    public void print(List<PrintedEditions> units) {
        System.out.println("\nPrint as Table: ");
        System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                "Title", "|", "Price", "|", "Page count", "|", "Number", "|", "Author", "|", "Age limit", "|", "Year", "|", "Is glossy", "|",
                "Is color", "|", "Genre", "|", "Language", "|", "Level", "|", "Science section"));
        System.out.println(String.format("%s", "--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------"));
        for (PrintedEditions item: units){
            if (item instanceof com.company.ht10.library.Magazine) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", ((Periodical) item).getNumber(), "|", "", "|", "", "|", "", "|", ((com.company.ht10.library.Magazine) item).isGlossy(), "|",
                        "", "|", "", "|", "", "|", "", "|", ""));
            }
            if (item instanceof com.company.ht10.library.Newspaper) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", ((Periodical) item).getNumber(), "|", "", "|", "", "|", "", "|", "", "|",
                        ((com.company.ht10.library.Newspaper) item).isColor(), "|", "", "|", "", "|", "", "|", ""));
            }
            if (item instanceof com.company.ht10.library.ProgrammingBook) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", "", "|", ((Book)item).getAuthor(), "|", ((Book)item).getAgeLimit(), "|",
                        ((Book)item).getPublishingYear(), "|", "", "|", "", "|", ((ProgrammingBook) item).getGenre(), "|", ((ProgrammingBook) item).getLanguage(),
                        "|", ((ProgrammingBook) item).getLevel(), "|", ""));
            }
            if (item instanceof com.company.ht10.library.ScientificBook) {
                System.out.println(String.format("%10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s %5s %10s %5s %15s %5s %10s %5s %10s %5s %10s",
                        item.getTitle(), "|", item.getPrice(), "|", item.getPageCount(), "|", "", "|", ((Book)item).getAuthor(), "|", ((Book)item).getAgeLimit(), "|",
                        ((Book)item).getPublishingYear(), "|", "", "|", "", "|", ((ScientificBook) item).getGenre(), "|", "",
                        "|", "", "|", ((ScientificBook) item).getScienceSection()));
            }
        }
    }
}
