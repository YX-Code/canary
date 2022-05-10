package cn.canary.core.dto.response;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Response with batch page record to return,
 * usually use in page query
 * <p/>
 *
 * @author yaojx
 */
public class PageResponse extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private int totalCount = 0;
    
    private int pageSize = 1;
    
    private int pageIndex = 1;
    
    private Collection<Object> result;
    
    public int getTotalCount() {
        return totalCount;
    }
    
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }
    
    public int getPageSize() {
        return Math.max(pageSize, 1);
    }
    
    public void setPageSize(int pageSize) {
        this.pageSize = Math.max(pageSize, 1);
    }
    
    public int getPageIndex() {
        return Math.max(pageIndex, 1);
    }
    
    public void setPageIndex(int pageIndex) {
        this.pageIndex = Math.max(pageIndex, 1);
    }
    
    public List<Object> getResult() {
        return null == result ? Collections.emptyList() : new ArrayList<Object>(result);
    }
    
    public void setData(Collection<Object> result) {
        this.result = result;
    }
    
    public int getTotalPages() {
        return this.totalCount % this.pageSize == 0 ? this.totalCount
            / this.pageSize : (this.totalCount / this.pageSize) + 1;
    }
    
    public boolean isEmpty() {
        return result == null || result.isEmpty();
    }
    
    public boolean isNotEmpty() {
        return !isEmpty();
    }
    
    public static PageResponse buildSuccess() {
        PageResponse response = new PageResponse();
        response.setSuccess(true);
        return response;
    }
    
    public static PageResponse buildFailure(String code, String errMessage) {
        PageResponse response = new PageResponse();
        response.setSuccess(false);
        response.setCode(code);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static PageResponse of(int pageSize, int pageIndex) {
        PageResponse response = new PageResponse();
        response.setSuccess(true);
        response.setData(Collections.emptyList());
        response.setTotalCount(0);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }
    
    public static PageResponse of(Collection<Object> result, int totalCount, int pageSize, int pageIndex) {
        PageResponse response = new PageResponse();
        response.setSuccess(true);
        response.setData(result);
        response.setTotalCount(totalCount);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }
    
}
