package com.company;

public class Printer {

    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        this.tonerLevel = (tonerLevel >= 0 && tonerLevel <= 100) ? tonerLevel : 0;
        this.pagesPrinted = 0;
        this.isDuplex = isDuplex;
    }

    public int tonerFillUp(int toner) {
        if (toner > 0) return tonerLevel = Math.min(tonerLevel + toner, 100);
        else return tonerLevel;
    }

    public int printPage(int pages) {
        if (pages > 0) {
            int pagesPrinted = (isDuplex) ? (int) Math.ceil((double) pages / 2) : pages;
            this.pagesPrinted += pagesPrinted;
            return pagesPrinted;
        } else {
            return 0;
        }
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
