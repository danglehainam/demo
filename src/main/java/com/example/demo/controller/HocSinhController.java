package com.example.demo.controller;

import com.example.demo.entity.HocSinh;
import com.example.demo.service.HocSinhService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/hocsinh")
public class HocSinhController {
    private HocSinhService service;

    public HocSinhController(HocSinhService service) {
        this.service = service;
    }

    @GetMapping
    public List<HocSinh>getAllHs(){
        return service.getAllHs();
    }

    @GetMapping("{id}")
    public HocSinh getHsById(@PathVariable Long id){
        return service.getHsById(id);
    }

    @PostMapping
    public HocSinh createHs(@RequestBody HocSinh hs){
        return service.createHs(hs);
    }

    @PutMapping("{id}")
    public HocSinh updateHs(@PathVariable Long id, @RequestBody HocSinh hs){
        return service.updateHs(hs, id);
    }

    @DeleteMapping("{id}")
    public void deleteHs(@PathVariable Long id){
        service.deleteHs(id);
    }
}
