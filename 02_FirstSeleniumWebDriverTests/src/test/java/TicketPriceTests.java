import org.junit.Assert;
import org.junit.Test;

public class TicketPriceTests {
    @Test
    public void TicketPricePercent()
    {
        var actualResult = getRefundTicketPricePercent(300, true, true);
        Assert.assertEquals(100, (long)getRefundTicketPricePercent(300,true,true));
    }
    @Test
    public void TicketPricePercent1()
    {
        var actualResult = getRefundTicketPricePercent(241, false, false);
        Assert.assertEquals(100, (long)getRefundTicketPricePercent(241,false,false));
    }
    @Test
    public void TicketPricePercent2()
    {
        var actualResult = getRefundTicketPricePercent(240, false, false);
        Assert.assertEquals(50, (long)getRefundTicketPricePercent(240,false,false));
    }
    @Test
    public void TicketPricePercent3()
    {
        var actualResult = getRefundTicketPricePercent(143, false, false);
        Assert.assertEquals(30, (long)getRefundTicketPricePercent(143,false,false));
    }
    @Test
    public void TicketPricePercent4()
    {
        var actualResult = getRefundTicketPricePercent(1, false, false);
        Assert.assertEquals(0, (long)getRefundTicketPricePercent(1,false,false));
    }
    private Integer getRefundTicketPricePercent(Integer hoursBeforeConcert, Boolean wasConcertCancelled, Boolean wasConcertRescheduled)


    {
        if(wasConcertCancelled && wasConcertRescheduled) return 100;
        if(hoursBeforeConcert>240) return 100;
        if(hoursBeforeConcert>=144 && hoursBeforeConcert<=240) return 50;
        if(hoursBeforeConcert>3 && hoursBeforeConcert<=144) return 30;
        return 0;
    }

}
