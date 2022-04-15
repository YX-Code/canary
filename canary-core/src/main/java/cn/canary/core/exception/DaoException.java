package cn.canary.core.exception;

/**
 * 数据访问层异常
 * 
 * @author yaojx
 */
public class DaoException extends SystemException{
    private static final long serialVersionUID = 3978239576518231694L;
    
    public DaoException() {
    }
    
    public DaoException(String message) {
        super(message);
    }
    
    public DaoException(String message, Throwable cause) {
        super(message, cause);
    }
    
    public DaoException(Throwable cause) {
        super(cause);
    }
    
    public DaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
