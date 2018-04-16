package com.company.ht10.library;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Library shell = new Library();
        shell.add(new Newspaper("Times", 34, 30, 4, true));
        shell.add(new Magazine("Playboy", 40, 50, 5, true));
        shell.add(new ProgrammingBook("Learn Java", 1200, 700, "Some author", "12+", 2010, "Java", "middle"));
        shell.add(new ScientificBook("New theory", 200, 300, "New author", "12+", 2015, "math"));

        Printable printer = new PrintAsTable();
        printer.print(shell.getUnits());
        Findable matcher = new FindByPrice(300);

        List<PrintedEditions> lists = shell.find(matcher);
        printer.print(lists);

        matcher = new FindByTitle("Times");

        lists = shell.find(matcher);
        printer.print(lists);

        printer = new PrintAsList();
        printer.print(shell.getUnits());

        shell.remove(new Magazine("Playboy", 40, 50, 5, true));

        printer.print(shell.getUnits());
    }
}
