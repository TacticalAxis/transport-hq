package com.nathandsouza.transporthq.transportcore.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class TransportController {

    private static final class Motd {
        final String message;
        final Integer code;

        public Motd(final String message, final Integer code) {
            this.message = message;
            this.code = code;
        }

        public String getMessage() {
            return message;
        }

        public Integer getCode() {
            return code;
        }
    }

    @GetMapping("/motd")
    public ResponseEntity<Motd> getMotd() {
        return new ResponseEntity<>(new Motd("Setting up TransportHQ", 777), HttpStatus.OK);
    }
}
