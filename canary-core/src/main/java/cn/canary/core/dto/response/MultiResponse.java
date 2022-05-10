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
public class MultiResponse extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private Collection<?> result;
    
    public List<Object> getResult() {
        return null == result ? Collections.emptyList() : new ArrayList<>(result);
    }
    
    public void setData(Collection<?> result) {
        this.result = result;
    }
    
    public boolean isEmpty() {
        return result == null || result.isEmpty();
    }
    
    public boolean isNotEmpty() {
        return !isEmpty();
    }
    
    public static MultiResponse buildSuccess() {
        MultiResponse response = new MultiResponse();
        response.setSuccess(true);
        return response;
    }
    
    public static MultiResponse buildFailure(String code, String errMessage) {
        MultiResponse response = new MultiResponse();
        response.setSuccess(false);
        response.setCode(code);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static MultiResponse of(Collection<Object> result) {
        MultiResponse response = new MultiResponse();
        response.setSuccess(true);
        response.setData(result);
        return response;
    }
    
}
