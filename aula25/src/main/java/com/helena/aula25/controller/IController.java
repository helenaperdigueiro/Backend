package com.helena.aula25.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public interface IController <T, U>{
    @GetMapping
    public ResponseEntity<Map<Integer, T>> getMethod();
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteMethod(@PathVariable Integer id);
    @PostMapping
    public ResponseEntity<T> postMethod(@RequestBody U dao);
    @PutMapping
    public ResponseEntity<T> putMethod(@RequestBody U dao);
}
