package com.gdschanyang.todayfeelingbackend2.service;


import com.gdschanyang.todayfeelingbackend2.domain.posts.ClinicPost;
import com.gdschanyang.todayfeelingbackend2.repository.ClinicPostRepository;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostUpdateRequestDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostResponseDto;
import com.gdschanyang.todayfeelingbackend2.web.dto.clinic.ClinicPostSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class ClinicPostService {
    private final ClinicPostRepository clinicPostRepository;

    @Transactional
    public void save(ClinicPostSaveRequestDto requestDto) {
        clinicPostRepository.save(requestDto.toEntity());
    }

    @Transactional
    public void update(Long id, ClinicPostUpdateRequestDto requestDto) {
        ClinicPost clinicPostEntity = clinicPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        clinicPostEntity.update(requestDto.getTitle(), requestDto.getContent());
    }

    @Transactional
    public ClinicPostResponseDto findById(Long id) {
        ClinicPost entity = clinicPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        return new ClinicPostResponseDto(entity);
    }

    @Transactional
    public void delete(Long id) {
        ClinicPost clinicPost = clinicPostRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("해당 게시글이 없습니다. id = " + id));

        clinicPostRepository.delete(clinicPost);
    }
}
