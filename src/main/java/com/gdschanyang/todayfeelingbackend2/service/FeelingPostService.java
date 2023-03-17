package com.gdschanyang.todayfeelingbackend2.service;

import com.gdschanyang.todayfeelingbackend2.domain.posts.FeelingPost;
import com.gdschanyang.todayfeelingbackend2.repository.FeelingPostRepository;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostResponseDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostSaveRequestDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.feeling.FeelingPostUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class FeelingPostService {
    private final FeelingPostRepository feelingPostRepository;

    @Transactional
    public void save(FeelingPostSaveRequestDto requestDto) {
        feelingPostRepository.save(requestDto.toEntity());
    }

    @Transactional
    public void update(Long id, FeelingPostUpdateRequestDto requestDto) {
        FeelingPost feelingPostEntity = feelingPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        feelingPostEntity.update(requestDto.getContent());
    }

    @Transactional
    public FeelingPostResponseDto findById(Long id) {
        FeelingPost entity = feelingPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new FeelingPostResponseDto(entity);
    }

    @Transactional
    public void delete(Long id) {
        FeelingPost feelingPost = feelingPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        feelingPostRepository.delete(feelingPost);
    }


}
