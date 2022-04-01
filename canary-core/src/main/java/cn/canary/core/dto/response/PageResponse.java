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
public class PageResponse<T> extends Response {
    
    private static final long serialVersionUID = 1L;
    
    private int totalCount = 0;
    
    private int pageSize = 1;
    
    private int pageIndex = 1;
    
    private Collection<T> result;
    
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
    
    public List<T> getResult() {
        return null == result ? Collections.emptyList() : new ArrayList<>(result);
    }
    
    public void setData(Collection<T> result) {
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
    
    public static PageResponse<Object> buildSuccess() {
        PageResponse<Object> response = new PageResponse<>();
        response.setSuccess(true);
        return response;
    }
    
    public static PageResponse<Object> buildFailure(String errCode, String errMessage) {
        PageResponse<Object> response = new PageResponse<>();
        response.setSuccess(false);
        response.setErrCode(errCode);
        response.setErrMessage(errMessage);
        return response;
    }
    
    public static <T> PageResponse<T> of(int pageSize, int pageIndex) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(Collections.emptyList());
        response.setTotalCount(0);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }
    
    public static <T> PageResponse<T> of(Collection<T> result, int totalCount, int pageSize, int pageIndex) {
        PageResponse<T> response = new PageResponse<>();
        response.setSuccess(true);
        response.setData(result);
        response.setTotalCount(totalCount);
        response.setPageSize(pageSize);
        response.setPageIndex(pageIndex);
        return response;
    }
    
}
