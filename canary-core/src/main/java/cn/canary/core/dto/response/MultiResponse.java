package cn.canary.core.dto.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Response with batch record to return,usually use in conditional query
 *
 * @author yaojx
 */
public class MultiResponse<T> extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private Collection<T> result;
    
    public List<T> getResult() {
        return null == result ? Collections.emptyList() : new ArrayList<>(result);
    }
    
    public void setData(Collection<T> result) {
        this.result = result;
    }
    
    public boolean isEmpty() {
        return result == null || result.isEmpty();
    }
    
    public boolean isNotEmpty() {
        return !isEmpty();
    }
    
    public static MultiResponse<Object> buildSuccess() {
        MultiResponse<Object> response = new MultiResponse<>();
        response.setSuccess(true);
        return response;
    }
    
    public static MultiResponse<Object> buildFailure(String errCode, String errMessage) {
        MultiResponse<Object> response = new MultiResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static <T> MultiResponse<T> of(Collection<T> result) {
        MultiResponse<T> response = new MultiResponse<>();
        response.setSuccess(true);
        response.setData(result);
        return response;
    }
    
}
