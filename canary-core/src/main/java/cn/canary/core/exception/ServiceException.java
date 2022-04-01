package cn.canary.core.exception;

/**
 * 系统异常
 * 
 * @author yaojx
 */
public class ServiceException extends RuntimeException{
    
    private static final long serialVersionUID = 2621534254358895994L;
    
    public ServiceException() {
        super();
    }
    
    public ServiceException(String message) {
        super(message);
    }
    
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public ServiceException(Throwable cause) {
        super(cause);
    }
    
    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
