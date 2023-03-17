package com.gdschanyang.todayfeelingbackend2.web.dto.feeling;

import com.gdschanyang.todayfeelingbackend2.domain.posts.Feeling;
import com.gdschanyang.todayfeelingbackend2.domain.posts.FeelingPost;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
@NoArgsConstructor
public class FeelingPostSaveRequestDto {

    private Long id;
    private Feeling feeling;
    private String content;

    @Builder
    public FeelingPostSaveRequestDto(Long id, Feeling feeling, String content) {
        this.id = id;
        this.feeling = feeling;
        this.content = content;
    }

    public FeelingPost toEntity() {
        return FeelingPost.builder()
                .id(id)
                .feeling(feeling)
                .content(content)
                .build();
    }

}
