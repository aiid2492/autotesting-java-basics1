import org.junit.Assert;
import org.junit.Test;

public class MarkResult {
        @Test
        public  void testRaven2()
        {
            var actualResult = getMarkResult(10);
            Assert.assertEquals("2", actualResult);

        }
        @Test
        public  void testRaven3()
        {
            var actualResult = getMarkResult(55);
            Assert.assertEquals("3", actualResult);

        }
        @Test
        public  void testRaven4()
        {
            var actualResult = getMarkResult(60);
            Assert.assertEquals("4", actualResult);

        }
        @Test
        public  void testRaven5()
        {
            var actualResult = getMarkResult(80);
            Assert.assertEquals("5", actualResult);

        }
        @Test
        public  void testRavenError1()
        {
            var actualResult = getMarkResult(72);
            Assert.assertEquals("5", actualResult);

        }
        @Test
        public  void testRavenError2()
        {
            var actualResult = getMarkResult(71);
            Assert.assertEquals("4", actualResult);

        }
        @Test
        public  void testRavenError3()
        {
            var actualResult = getMarkResult(71);
            Assert.assertEquals("5", actualResult);

        }
        @Test
        public  void testRavenError4()
        {
            var actualResult = getMarkResult(-50);
            Assert.assertEquals("no mark result", actualResult);

        }
        @Test
        public  void testRavenError5()
        {
            var actualResult = getMarkResult(150);
            Assert.assertEquals("no mark result", actualResult);

        }
        private String getMarkResult(Integer mark)
        {
            if(mark>=0 && mark <=35) return "2";

            if(mark>35 && mark <=56) return "3";

            if(mark>56 && mark<71) return "4";

            if(mark>72 && mark<100) return "5";

            return "no mark result";
        }
}
