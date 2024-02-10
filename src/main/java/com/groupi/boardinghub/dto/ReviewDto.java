package com.groupi.boardinghub.dto;

import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReviewDto {
    private String reviewId;
    private String title;
    private String body;
}
