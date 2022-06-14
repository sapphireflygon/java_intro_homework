import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {
    Printer testPrinter;

    @Before
    public void before(){
        testPrinter = new Printer(100, 125);
    }

    @Test
    public void printerHasPaper(){
        int result = testPrinter.getPaperInPrinter();
        assertEquals(100, result);
    }

    @Test
    public void printerPrintsMultipleCopies(){
        testPrinter.print(3, 5);
        int result = testPrinter.getPaperInPrinter();
        assertEquals(85, result);
    }

    @Test
    public void printerWillNotPrintIfNotEnoughPaper(){
        testPrinter.print(50, 3);
        int result = testPrinter.getPaperInPrinter();
        assertEquals(100, result);
    }

    @Test
    public void printerPrintsTillPaperEmptyBeforeRefusingToPrint(){
        testPrinter.print(3, 12);
        assertEquals(64, testPrinter.getPaperInPrinter());
        testPrinter.print(4, 9);
        assertEquals(28, testPrinter.getPaperInPrinter());
        testPrinter.print(14, 2);
        assertEquals(0, testPrinter.getPaperInPrinter());
        testPrinter.print(4, 1);
        assertEquals(0, testPrinter.getPaperInPrinter());
    }

    @Test
    public void printerHasToner(){
        int result = testPrinter.getToner();
        assertEquals(75, result);
    }

    @Test
    public void printerTonerReducesBy1ForEachPagePrinted(){
        testPrinter.print(3, 10);
        assertEquals(95, testPrinter.getToner());
    }
}
