package com.czwm.dto.cust.detail;

import com.czwm.common.page.Pagination;

/**
 * Created by apple on 2017/5/19.
 */
public class CustQueryRequest {
    private Integer id;
    private String tratorName;
    private Integer custType;
    private Pagination pagination;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTratorName() {
        return tratorName;
    }

    public void setTratorName(String tratorName) {
        this.tratorName = tratorName;
    }

    public Pagination getPagination() {
        return pagination;
    }

    public void setPagination(Pagination pagination) {
        this.pagination = pagination;
    }

    public Integer getCustType() {
        return custType;
    }

    public void setCustType(Integer custType) {
        this.custType = custType;
    }
}
