package model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Response {
    private String uid;

 private String operationUid;
 private String systenTime;
 private String code;

 private String errorCode;

 private String errorMessage;
}
