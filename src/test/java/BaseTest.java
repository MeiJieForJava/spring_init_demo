//import com.alibaba.fastjson.JSONArray;
//import com.alibaba.fastjson.JSONObject;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/application.xml"})
public class BaseTest {

//    @Test
//    public void test(){
//        String a  = "[{'pk':1045002,'pin':'sunya05@JTK','order_type':2402,'in_out_type':2,'amount':11.0000,'create_time':'2018-05-21 13:57:33','status':1,'show_date':20180521,'group_id':1004,'user_type':3,'master_id':'bjjrsm','uuid':'52017111510003212402','play_amount':11.0000,'action_time':'2018-05-21 13:56:11','click_id':'5201711151000321'},{'pk':1045002,'pin':'sunya05@JTK','order_type':2402,'in_out_type':2,'amount':11.0000,'create_time':'2018-05-21 13:57:33','status':1,'show_date':20180521,'group_id':1004,'user_type':3,'master_id':'bjjrsm','uuid':'52017111510003212402','play_amount':11.0000,'action_time':'2018-05-21 13:56:11','click_id':'5201711151000321'}]";
////        System.out.println(JSONObject.parseObject());
//        JSONObject aa = (JSONObject)JSONArray.parseArray(a).get(0);
//        System.out.println(aa.getString("create_time"));
////        JSONObject aaa = JSONArray.parseObject(a);
////        System.out.println(aaa);
//
//        JSONArray array = JSONArray.parseArray(a);
//        System.out.println(array.size());
//    }

    @Test
    public void test1() {
//        String[] a = ",p_756151:20180612".split(",");
//        System.out.println(a.length);
        BigDecimal a = (BigDecimal.valueOf(3188)).divide(BigDecimal.valueOf(325700), 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100L));
        BigDecimal b = BigDecimal.valueOf(98291).divide(BigDecimal.valueOf(104068), 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100L));
        System.out.println(a.toString());
        System.out.println(b.toString());
    }


    @Test
    public void test2() {
        String URL_PC_REGEX = "^https://(pro.(yhd.com/yhd|jd.com/mall){1}/active/\\w+/index|sale.(jd|yhd){1}.com/act/\\w+)\\.html$";
        String URL_WX_REGEX = "^https://(pro.m.jd.com/(yhd|mall){1}/active/\\w+/index|sale.(jd|yhd){1}.com/m/act/\\w+)\\.html$";

        String URL_YHD_REGEX = "(yhd.com|pro.m.jd.com/yhd){1}";
        //private static final String URL_JD_REGEX = "";


        //通天塔
        String URL_BEACON_REGEX = "^https://(pro.(yhd.com/yhd|jd.com/mall|m.jd.com/mall|m.jd.com/yhd){1}/active/\\w+/index)\\.html$";
        String URL_JSHOP_REGEX = "^https://(sale.(jd|yhd){1}.com/act/\\w+|sale.(jd|yhd){1}.com/m/act/\\w+)\\.html$";

        Pattern pattern = Pattern.compile(URL_PC_REGEX);

        System.out.println(pattern.matcher("https://pro.m.jd.com/mall/active/3LkgHYmy8Fy6pDQk6e3uzGTNPjB1/index.html").matches());

    }

    @Test
    public void test3() {
        Assert.isTrue(StringUtils.equals("a", "b"), "不能越权操作");
    }
}