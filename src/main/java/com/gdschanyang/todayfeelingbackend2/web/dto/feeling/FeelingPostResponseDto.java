package com.gdschanyang.todayfeelingbackend2.web.dto.feeling;


import com.gdschanyang.todayfeelingbackend2.domain.posts.Feeling;
import com.gdschanyang.todayfeelingbackend2.domain.posts.FeelingPost;
import lombok.Getter;

@Getter
public class FeelingPostResponseDto {

    private Long id;

    private Feeling feeling;

    private String content;

    public FeelingPostResponseDto(FeelingPost entity) {
        this.id = entity.getId();
        this.feeling = entity.getFeeling();
        this.content = entity.getContent();
    }
}
