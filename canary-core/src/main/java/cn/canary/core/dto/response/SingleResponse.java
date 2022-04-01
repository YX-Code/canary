package cn.canary.core.dto.response;

/**
 * Response with single record to return
 * <p/>
 *
 * @author yaojx
 */
public class SingleResponse<T> extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private T result;
    
    public T getResult() {
        return result;
    }
    
    public void setResult(T result) {
        this.result = result;
    }
    
    public static SingleResponse<Object> buildSuccess() {
        SingleResponse<Object> response = new SingleResponse<>();
        response.setSuccess(true);
        return response;
    }
    
    public static SingleResponse<Object> buildFailure(String errCode, String errMessage) {
        SingleResponse<Object> response = new SingleResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static <T> SingleResponse<T> of(T result) {
        SingleResponse<T> response = new SingleResponse<>();
        response.setSuccess(true);
        response.setResult(result);
        return response;
    }
    
}
