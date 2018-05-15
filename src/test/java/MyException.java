/**
 * Created with IDEA
 * USER : meijie
 * Date : 2018/4/8
 * Time : 14:54
 */
public class MyException extends RuntimeException{

    private static final long serialVersionUID = 1L;

    private String serviceMsg = "";

    public MyException() {
        super();
    }

    public MyException(String serviceMsg) {
        super(serviceMsg, null);
        this.serviceMsg = serviceMsg;
    }

    public MyException(String msg, Throwable cause) {
        super(msg, cause);
        this.serviceMsg = msg;
    }

    public MyException(Throwable cause) {
        super(cause);
    }

    public MyException(String serviceMsg, String exceptionMsg) {
        super(exceptionMsg, null);
        this.serviceMsg = serviceMsg;
    }

    public MyException(String serviceMsg, String exceptionMsg, Throwable cause) {
        super(exceptionMsg, cause);
        this.serviceMsg = serviceMsg;
    }

    public String getServiceMsg() {
        return serviceMsg;
    }
    
}
