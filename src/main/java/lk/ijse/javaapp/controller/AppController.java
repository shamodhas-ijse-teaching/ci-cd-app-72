package lk.ijse.javaapp.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * --------------------------------------------
 * Author: Shamodha Sahan
 * GitHub: https://github.com/shamodhas
 * Website: https://shamodha.com
 * --------------------------------------------
 * Created: 2/20/2026 8:55 AM
 * Project: Java-App
 * --------------------------------------------
 **/

@RestController
@RequestMapping("/api/v1/app")
public class AppController {

    @GetMapping
    public ResponseEntity<?> get() {
        return new ResponseEntity<>(
                "Java Spring application running...!",
                HttpStatus.OK
        );
    }

    @GetMapping("/kill")
    public ResponseEntity<?> killApplication() {
        new Thread(() -> {
            try{
                Thread.sleep(1000);
                System.out.println("killing the application...!");
                System.exit(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
        return new ResponseEntity<>(
                "killing the application...!",
                HttpStatus.OK
        );
    }
}
