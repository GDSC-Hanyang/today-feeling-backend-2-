package com.gdschanyang.todayfeelingbackend2.web.dto.clinic;

import com.gdschanyang.todayfeelingbackend2.domain.posts.ClinicPost;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ClinicPostSaveRequestDto {
    private Long id;
    private String title;
    private String content;

    @Builder
    public ClinicPostSaveRequestDto(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    public ClinicPost toEntity() {
        return ClinicPost.builder()
                .id(id)
                .title(title)
                .content(content)
                .build();
    }

}
