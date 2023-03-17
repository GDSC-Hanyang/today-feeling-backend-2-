package com.gdschanyang.todayfeelingbackend2.web.dto.clinic;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClinicPostUpdateRequestDto {
    private String title;
    private String content;

    @Builder
    public ClinicPostUpdateRequestDto(String title, String content) {
        this.title = title;
        this.content = content;
    }
}
