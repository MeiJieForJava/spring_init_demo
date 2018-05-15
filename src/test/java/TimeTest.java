import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;

/**
 * Created with IDEA
 * USER : meijie
 * Date : 2018/4/8
 * Time : 10:33
 */
public class TimeTest extends BaseTest {


    class Asa {
        private Date startTime;
        private Date endTime;

        public Date getStartTime() {
            return startTime;
        }

        public void setStartTime(Date startTime) {
            this.startTime = startTime;
        }

        public Date getEndTime() {
            return endTime;
        }

        public void setEndTime(Date endTime) {
            this.endTime = endTime;
        }
    }

    @Test
    public void test1() throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        String startdate1 = "2018-05-06 12:12:13";
        String enddate1 = "2018-05-08 23:59:59";

        String startdate2 = "2018-05-09 12:12:13";
        String enddate2 = "2018-05-15 12:12:13";

        String startdate3 = "2018-05-01 12:12:13";
        String enddate3 = "2018-05-02 12:12:13";

        String startdate4 = "2018-05-25 12:12:13";
        String enddate4 = "2018-05-28 12:12:13";

        String startdate5 = "2018-05-11 12:12:13";
        String enddate5 = "2018-05-12 12:12:13";

        String startdate6 = "2018-05-11 12:12:13";
        String enddate6 = "2018-05-12 12:12:13";

        String startdate7 = "2018-05-01 12:12:13";
        String enddate7 = "2018-05-31 12:12:13";


        Date startDate11 = df.parse(startdate1);
        Date enddate11 = df.parse(enddate1);

        Date startDate22 = df.parse(startdate2);
        Date enddate22 = df.parse(enddate2);

        Date startDate33 = df.parse(startdate3);
        Date enddate33 = df.parse(enddate3);

        Date startDate44 = df.parse(startdate4);
        Date enddate44 = df.parse(enddate4);

        Date startDate55 = df.parse(startdate5);
        Date enddate55 = df.parse(enddate5);

        Date startDate66 = df.parse(startdate6);
        Date enddate66 = df.parse(enddate6);

        Date startDate77 = df.parse(startdate7);
        Date enddate77 = df.parse(enddate7);

        Asa asa1 = new Asa();
        asa1.setStartTime(startDate22);
        asa1.setEndTime(enddate22);


        Asa asa2 = new Asa();
        asa2.setStartTime(startDate66);
        asa2.setEndTime(enddate66);

        Asa asa3 = new Asa();
        asa3.setStartTime(startDate77);
        asa3.setEndTime(enddate77);

        List<Asa> asaList = Lists.newArrayList(asa1, asa2, asa3);

        long[] startarr = {asa1.getStartTime().getTime(), asa2.getStartTime().getTime(), asa3.getStartTime().getTime()};
        long[] endarr = {asa1.getEndTime().getTime(), asa2.getEndTime().getTime(), asa3.getEndTime().getTime()};
        quickSort(startarr, 0, startarr.length - 1);
        quickSort(endarr, 0, endarr.length - 1);

        Calendar c = Calendar.getInstance();

        c.setTimeInMillis(startarr[startarr.length - 1]);
        System.out.println(df.format(c.getTime()));

        c.setTimeInMillis(endarr[0]);
        System.out.println(df.format(c.getTime()));


    }


    public static void quickSort(long[] arr, int low, int high) {
        int i, j;
        long temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        //temp就是基准位
        temp = arr[low];

        while (i < j) {
            //先看右边，依次往左递减
            while (temp <= arr[j] && i < j) {
                j--;
            }
            //再看左边，依次往右递增
            while (temp >= arr[i] && i < j) {
                i++;
            }
            //如果满足条件则交换
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }

        }
        //最后将基准为与i和j相等位置的数字交换
        arr[low] = arr[i];
        arr[i] = temp;
        //递归调用左半数组
        quickSort(arr, low, j - 1);
        //递归调用右半数组
        quickSort(arr, j + 1, high);
    }


}
