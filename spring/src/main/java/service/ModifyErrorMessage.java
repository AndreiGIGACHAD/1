package service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
 @Qualifier("ModifyErrortessage")
     public class ModifyErrorMessage implements MyModifyService {

    @Override

    public Response modify(Response response) {

        response.setErrorMessage("Что сломалось");

        return response;
    }
}