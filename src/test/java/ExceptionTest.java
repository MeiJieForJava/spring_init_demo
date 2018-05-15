import org.junit.Test;

/**
 * Created with IDEA
 * USER : meijie
 * Date : 2018/4/8
 * Time : 14:55
 */
public class ExceptionTest extends BaseTest {

    @Test
    public void te() {
        try {
            try {
                System.out.println("a");
                throw new Exception("a");
            } catch (MyException e) {
                System.out.println(e.getMessage());
                throw e;
            } catch (Exception e) {
                System.out.println("b");
                System.out.println(e.getMessage());
            }
        }catch (Exception e){
            System.out.println(e.getMessage() + "aaa");
        }

    }

}
