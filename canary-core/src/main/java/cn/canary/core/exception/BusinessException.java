package cn.canary.core.exception;

/**
 * 业务异常
 *
 * @author yaojx
 */
public class BusinessException extends Exception {
    private static final long serialVersionUID = 8676427633003844675L;
    
    public BusinessException() {
        super();
    }
    
    public BusinessException(String message) {
        super(message);
    }
    
    public BusinessException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public BusinessException(Throwable cause) {
        super(cause);
    }
    
    protected BusinessException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
