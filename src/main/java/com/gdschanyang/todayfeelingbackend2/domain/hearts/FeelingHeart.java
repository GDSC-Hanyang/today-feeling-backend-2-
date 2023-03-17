package com.gdschanyang.todayfeelingbackend2.domain.hearts;

import com.gdschanyang.todayfeelingbackend2.domain.BaseTimeEntity;
import com.gdschanyang.todayfeelingbackend2.domain.posts.FeelingPost;
import com.gdschanyang.todayfeelingbackend2.domain.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class FeelingHeart extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "FEELINGHEART_ID")
    private Long id;

    // 2. FeelingHeart : User = n : 1
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    // 3. FeelingHeart : FeelingPost = n : 1
    @ManyToOne
    @JoinColumn(name = "FEELINGPOST_ID")
    private FeelingPost feelingPost;

    @Builder
    public FeelingHeart(Long id) {
        this.id = id;
        this.user.addFeelingHeart(this);
        this.feelingPost.addFeelingHeart(this);
    }


}
