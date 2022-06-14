public class Printer {
    private int paperInPrinter;
    private int toner;

    public Printer(int paperInPrinter, int toner) {
        this.paperInPrinter = paperInPrinter;
        this.toner = toner;
    }

    public int getPaperInPrinter() {
        return paperInPrinter;
    }

    public void print(int numberOfPages, int numberOfCopies) {
        int totalPages = numberOfPages * numberOfCopies;
        if (totalPages <= paperInPrinter && totalPages <= toner) {
            this.paperInPrinter = paperInPrinter - totalPages;
            this.toner = toner - totalPages;
        }
    }

    public int getToner() {
        return toner;
    }
}
