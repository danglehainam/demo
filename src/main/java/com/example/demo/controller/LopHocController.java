package com.example.demo.controller;

import com.example.demo.entity.LopHoc;
import com.example.demo.service.LopHocService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/lophoc")
public class LopHocController {

    private LopHocService service;

    public LopHocController(LopHocService service) {
        this.service = service;
    }

    @GetMapping
    public List<LopHoc>getAllLophoc(){
        return service.getAllLh();
    }

    @GetMapping("{id}")
    public LopHoc getLophocById(@PathVariable Long id){
        return service.getLopHocById(id);
    }

    @PostMapping
    public LopHoc createLophoc(@RequestBody LopHoc lh){
        return service.createLh(lh);
    }

    @PutMapping("{id}")
    public LopHoc updateLophoc(@PathVariable Long id, @RequestBody LopHoc lh){
        return service.updateLopHoc(id, lh);
    }

    @DeleteMapping("{id}")
    public void deleteLophoc(@PathVariable Long id){
        service.deleteLopHoc(id);
    }
}
