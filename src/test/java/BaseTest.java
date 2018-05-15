import org.apache.commons.lang.StringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring和junit整合，junit启动时加载springIOC容器 spring-test,junit
 */
@RunWith(SpringJUnit4ClassRunner.class)
// 告诉junit spring配置文件
@ContextConfiguration({"classpath:spring/application.xml"})
public class BaseTest {

    @Test
    public void trest() {
        String[] a = StringUtils.split("1|2", "|");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}