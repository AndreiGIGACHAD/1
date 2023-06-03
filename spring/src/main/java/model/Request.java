package model;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.Size;
import javax.validation.constraints.NotBLank;
import javax.validation.constraints.Size;




    @Data
    @Builder
    public class Request {

        @NotBLank
        @Size(max = 32)

        private String uid;
        @NotBLank

        @Size(max = 32)

        private String operationUid;

        private String systemName;

        @NotBLank
        private String systemTime;

        private String source;

        private Integer communicationId;
        private Integer templateId;

        @Max(7)
        private Integer productCode;

        @Max(5)
        private Integer smsCode;


    }
