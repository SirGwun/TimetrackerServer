package com.timetracker.server;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClientController {
    @PostMapping(path = "/deviceTrackerServer", consumes = "application/json", produces = "text/plain")
    public ResponseEntity<String> accept(@RequestBody String payload) {
        System.out.println(payload);
        // TODO: распарсить JSON в твою DTO (Snapshot) и положить в очередь/БД
        return ResponseEntity.ok("accepted");
    }
}
