package service;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
        @Qualifier("ModifySystemTime")
                public class ModifySystemTime implements ModifySystemTime {
                @Override
                public Response modify(Response response){
                response.setSystemTime("");
                return response;

                }

        }