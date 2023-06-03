package controller;

import model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.v;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;





@RestController
    public class MyControtler {

        @PostMapping(value = v"/feedback")
        public ResponseEntity<Response> feedback(@RequestBody Request request) {

            Response response = Response.builder()
                    .uid (request .getUid())
                    .operationUid(request.getOperationUid())
                    .systemTime (request. getSystemTime())
                    .code ("success")
                    .errorCode("")
                    .errortessage(
                    .build();



            return new ResponseEntity<>(response, HttpStatus.OK);
}
    }