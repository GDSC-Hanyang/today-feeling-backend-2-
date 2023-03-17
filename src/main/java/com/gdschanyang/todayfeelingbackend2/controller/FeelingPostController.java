package com.gdschanyang.todayfeelingbackend2.controller;


import com.gdschanyang.todayfeelingbackend2.service.FeelingPostService;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostResponseDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostSaveRequestDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RequiredArgsConstructor
@RestController
public class FeelingPostController {

    private final FeelingPostService feelingPostService;

    @PostMapping("/api/feelingpost")
    public void save(@RequestBody FeelingPostSaveRequestDto requestDto) {
        feelingPostService.save(requestDto);
    }

    @PutMapping("/api/feelingpost/{id}")
    public void update(@PathVariable Long id, @RequestBody FeelingPostUpdateRequestDto requestDto) {
        feelingPostService.update(id, requestDto);
    }

    @GetMapping("/api/feelingpost/{id}")
    public FeelingPostResponseDto findById(@PathVariable Long id) {
        return feelingPostService.findById(id);
    }

    @DeleteMapping("/api/feelingpost/{id}")
    public void delete(@PathVariable Long id) {
        feelingPostService.delete(id);
    }
}
