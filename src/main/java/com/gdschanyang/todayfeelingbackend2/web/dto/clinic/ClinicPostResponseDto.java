package com.gdschanyang.todayfeelingbackend2.web.dto.clinic;

import com.gdschanyang.todayfeelingbackend2.domain.posts.ClinicPost;
import lombok.Getter;

@Getter
public class ClinicPostResponseDto {
    private Long id;
    private String title;
    private String content;

    public ClinicPostResponseDto(ClinicPost entity) {
        this.id = entity.getId();
        this.title = entity.getTitle();
        this.content = entity.getContent();
    }
}
