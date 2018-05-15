import org.junit.Test;

import java.util.*;

/**
 * Created with IDEA
 * USER : meijie
 * Date : 2018/5/3
 * Time : 16:57
 */
public class ABTest {

    @Test
    public void test() throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(1000);
        Date date2 = new Date();
        Thread.sleep(1000);
        Date date3 = new Date();
        Thread.sleep(1000);
        Date date4 = new Date();
        Thread.sleep(1000);
        Date date5 = new Date();
        Thread.sleep(1000);
        Date date6 = new Date();
        Thread.sleep(1000);

        List<Date> dates = new ArrayList<Date>();

        dates.add(date1);
        dates.add(date2);
        dates.add(date3);
        dates.add(date4);
        dates.add(date5);
        dates.add(date6);

//        Collections.sort(dates, new Comparator<Date>() {
//            @Override
//            public int compare(Date o1, Date o2) {
//                if (o1.before(o2)) {
//                    return -1;
//                } else if (o1.after(o2)) {
//                    return 1;
//
//                } else {
//                    return 0;
//                }
//            }
//        });

        Collections.sort(dates);

        System.out.println(dates);

    }
}
