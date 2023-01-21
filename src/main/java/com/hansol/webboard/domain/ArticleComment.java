package com.hansol.webboard.domain;

import java.time.LocalDateTime;

public class ArticleComment {

    private Long id;
    private String content; // 본문
    private Article article; // 게시글 (ID)

    private LocalDateTime createdAt; // 생성일시
    private String createdBy; // 생성자
    private LocalDateTime modifiedAt; // 수정일시
    private String ModifiedBy; // 수정자

}
