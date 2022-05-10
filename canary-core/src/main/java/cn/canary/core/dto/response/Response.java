package cn.canary.core.dto.response;


import cn.canary.core.dto.AbstractDTO;

/**
 * Response to caller
 *
 * @author yaojx
 */
public class Response extends AbstractDTO {
    
    private static final long serialVersionUID = 1L;
    
    private boolean success;
    
    private String code;
    
    private String errMessage;
    
    public boolean isSuccess() {
        return success;
    }
    
    public void setSuccess(boolean success) {
        this.success = success;
    }
    
    public String getCode() {
        return code;
    }
    
    public void setCode(String code) {
        this.code = code;
    }
    
    public String getErrMessage() {
        return errMessage;
    }
    
    public void setErrMessage(String errMessage) {
        this.errMessage = errMessage;
    }
    
    @Override
    public String toString() {
        return "Response [success=" + success + ", code=" + code + ", errMessage=" + errMessage + "]";
    }
    
    public static Response buildSuccess() {
        Response response = new Response();
        response.setSuccess(true);
        return response;
    }
    
    public static Response buildFailure(String code, String errMessage) {
        Response response = new Response();
        response.setSuccess(false);
        response.setCode(code);
        response.setErrMessage(errMessage);
        return response;
    }
    
}
