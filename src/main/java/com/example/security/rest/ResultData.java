package com.example.security.rest;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;
import org.springframework.http.ResponseEntity;

import java.util.Date;
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultData {
    private Object data;
    private Integer status = 200;
    private Integer totalCount;
    private String code = "OK";
    private String message = "Success";
    private Date timestamp = new Date();

    public ResultData() {
    }

    public ResultData(Object data) {
        this.data = data;
    }

    public ResultData(Object data, String code) {
        this.data = data;
        this.code = code;
    }


    public static ResponseEntity<ResultData> ok(Object data) {
        var resultData = new ResultData();
        resultData.setData(data);

        return ResponseEntity.ok(resultData);
    }

    public static ResponseEntity<ResultData> ok(ResultData resultData) {
        return ResponseEntity.ok(resultData);
    }

    public static ResponseEntity<ResultData> ok(int totalCount, Object data) {
        var resultData = new ResultData();
        resultData.setData(data);
        resultData.setTotalCount(totalCount);

        return ResponseEntity.ok(resultData);
    }

}
