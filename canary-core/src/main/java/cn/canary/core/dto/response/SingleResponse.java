package cn.canary.core.dto.response;

/**
 * Response with single record to return
 * <p/>
 *
 * @author yaojx
 */
public class SingleResponse extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private Object result;
    
    public Object getResult() {
        return result;
    }
    
    public void setResult(Object result) {
        this.result = result;
    }
    
    public static SingleResponse buildSuccess() {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);
        return response;
    }
    
    public static SingleResponse buildFailure(String code, String errMessage) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(false);
        response.setCode(code);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static SingleResponse of(Object result) {
        SingleResponse response = new SingleResponse();
        response.setSuccess(true);
        response.setResult(result);
        return response;
    }
    
}
