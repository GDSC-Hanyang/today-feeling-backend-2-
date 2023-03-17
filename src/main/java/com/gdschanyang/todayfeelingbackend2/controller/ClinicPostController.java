package com.gdschanyang.todayfeelingbackend2.controller;


import com.gdschanyang.todayfeelingbackend2.service.ClinicPostService;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostResponseDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostSaveRequestDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class ClinicPostController {

    private final ClinicPostService clinicPostService;

    @PostMapping("/api/clinicpost")
    public void save(@RequestBody ClinicPostSaveRequestDto requestDto) {
        clinicPostService.save(requestDto);
    }

    @PutMapping("/api/clinicpost/{id}")
    public void update(@PathVariable Long id, @RequestBody ClinicPostUpdateRequestDto requestDto) {
        clinicPostService.update(id, requestDto);
    }

    @GetMapping("/api/clinicpost/{id}")
    public ClinicPostResponseDto findById(@PathVariable Long id) {
        return clinicPostService.findById(id);
    }

    @DeleteMapping("/api/clinicpost/{id}")
    public void delete(@PathVariable Long id) {
        clinicPostService.delete(id);
    }
}
