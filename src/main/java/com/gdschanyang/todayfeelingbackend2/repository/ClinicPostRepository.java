package com.gdschanyang.todayfeelingbackend2.repository;

import com.gdschanyang.todayfeelingbackend2.domain.posts.ClinicPost;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClinicPostRepository extends JpaRepository<ClinicPost, Long> {
}
