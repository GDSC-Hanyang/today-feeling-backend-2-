package com.gdschanyang.todayfeelingbackend2.web.dto.feeling;


import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeelingPostUpdateRequestDto {
    private String content;

    @Builder
    public FeelingPostUpdateRequestDto(String content) {
        this.content = content;
    }
}
