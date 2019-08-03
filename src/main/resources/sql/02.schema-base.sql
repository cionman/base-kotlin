-- 회원
CREATE TABLE `TB_USER`
(
    `USER_ID`     BIGINT(20) UNSIGNED NOT NULL COMMENT '회원ID',  -- 회원ID
    `REG_DT`      DATETIME            NOT NULL COMMENT '등록일시',  -- 등록일시
    `CHG_DT`      DATETIME            NOT NULL COMMENT '수정일시',  -- 수정일시
    `REG_IP`      VARCHAR(15)         NOT NULL COMMENT '등록아이피', -- 등록아이피
    `LOGIN_ID`    VARCHAR(64)         NOT NULL COMMENT '로그인ID', -- 로그인ID
    `USER_STATUS` VARCHAR(12)         NOT NULL COMMENT '회원상태',  -- 회원상태
    `PHONE`       VARCHAR(20)         NOT NULL COMMENT '연락처',   -- 연락처
    `USER_NAME`   VARCHAR(100)        NOT NULL COMMENT '회원명',   -- 회원명
    `USER_NICK`   VARCHAR(100)        NOT NULL COMMENT '회원닉',   -- 회원닉
    `EMAIL`       VARCHAR(100)        NOT NULL COMMENT '이메일',   -- 이메일
    `GENDER`      VARCHAR(12)         NOT NULL COMMENT '성별',    -- 성별
    `BIRTHDAY`    DATE                NOT NULL COMMENT '생년월일',  -- 생년월일
    `PASSWD`      VARCHAR(64)         NOT NULL COMMENT '비밀번호',  -- 비밀번호
    `ROLE_ID`     BIGINT(20) UNSIGNED NULL COMMENT '역할ID'       -- 역할ID
)
    COMMENT '회원';

-- 회원
ALTER TABLE `TB_USER`
    ADD CONSTRAINT `PK_TB_USER` -- 회원 Primary key
        PRIMARY KEY (
                     `USER_ID` -- 회원ID
            );

-- 회원 Unique Index
CREATE UNIQUE INDEX `UIX_TB_USER`
    ON `TB_USER` ( -- 회원
                  `LOGIN_ID` ASC -- 로그인ID
        );

ALTER TABLE `TB_USER`
    MODIFY COLUMN `USER_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '회원ID';

-- 옵션
CREATE TABLE `TB_OPTION`
(
    `OPTION_ID`      BIGINT(20) UNSIGNED NOT NULL COMMENT '옵션ID',  -- 옵션ID
    `REG_ID`         BIGINT(20) UNSIGNED NOT NULL COMMENT '등록ID',  -- 등록ID
    `CHG_ID`         BIGINT(20) UNSIGNED NOT NULL COMMENT '수정ID',  -- 수정ID
    `REG_DT`         DATETIME            NOT NULL COMMENT '등록일시',  -- 등록일시
    `CHG_DT`         DATETIME            NOT NULL COMMENT '수정일시',  -- 수정일시
    `REG_IP`         VARCHAR(15)         NOT NULL COMMENT '등록아이피', -- 등록아이피
    `CHG_IP`         VARCHAR(15)         NOT NULL COMMENT '수정아이피', -- 수정아이피
    `OPTION_NAME`    VARCHAR(100)        NOT NULL COMMENT '옵션명',   -- 옵션명
    `OPTION_CONTENT` LONGTEXT            NOT NULL COMMENT '옵션내용'   -- 옵션내용
)
    COMMENT '옵션';

-- 옵션
ALTER TABLE `TB_OPTION`
    ADD CONSTRAINT `PK_TB_OPTION` -- 옵션 Primary key
        PRIMARY KEY (
                     `OPTION_ID` -- 옵션ID
            );

-- 옵션 Unique Index
CREATE UNIQUE INDEX `UIX_TB_OPTION`
    ON `TB_OPTION` ( -- 옵션
                    `OPTION_NAME` ASC -- 옵션명
        );

ALTER TABLE `TB_OPTION`
    MODIFY COLUMN `OPTION_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '옵션ID';

-- 회원역할
CREATE TABLE `TB_USER_ROLE`
(
    `ROLE_ID`    BIGINT(20) UNSIGNED NOT NULL COMMENT '역할ID',  -- 역할ID
    `REG_ID`     BIGINT(20) UNSIGNED NOT NULL COMMENT '등록ID',  -- 등록ID
    `CHG_ID`     BIGINT(20) UNSIGNED NOT NULL COMMENT '수정ID',  -- 수정ID
    `REG_DT`     DATETIME            NOT NULL COMMENT '등록일시',  -- 등록일시
    `CHG_DT`     DATETIME            NOT NULL COMMENT '수정일시',  -- 수정일시
    `REG_IP`     VARCHAR(15)         NOT NULL COMMENT '등록아이피', -- 등록아이피
    `CHG_IP`     VARCHAR(15)         NOT NULL COMMENT '수정아이피', -- 수정아이피
    `ROLE_NAME`  VARCHAR(100)        NOT NULL COMMENT '역할명',   -- 역할명
    `ROLE_GROUP` VARCHAR(300)        NOT NULL COMMENT '역할그룹',  -- 역할그룹
    `ROLE_DESC`  VARCHAR(3000)       NULL COMMENT '역할설명'       -- 역할설명
)
    COMMENT '회원역할';

-- 회원역할
ALTER TABLE `TB_USER_ROLE`
    ADD CONSTRAINT `PK_TB_USER_ROLE` -- 역할관리 Primary key
        PRIMARY KEY (
                     `ROLE_ID` -- 역할ID
            );

ALTER TABLE `TB_USER_ROLE`
    MODIFY COLUMN `ROLE_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '역할ID';

-- 회원로그인
CREATE TABLE `TB_USER_LOGIN`
(
    `LOGIN_ID` BIGINT(20) UNSIGNED NOT NULL COMMENT '로그인ID', -- 로그인ID
    `USER_ID`  BIGINT(20) UNSIGNED NOT NULL COMMENT '회원ID',  -- 회원ID
    `REG_DT`   DATETIME            NOT NULL COMMENT '등록일시',  -- 등록일시
    `REG_IP`   VARCHAR(15)         NOT NULL COMMENT '등록아이피'  -- 등록아이피
)
    COMMENT '회원로그인';

-- 회원로그인
ALTER TABLE `TB_USER_LOGIN`
    ADD CONSTRAINT `PK_TB_USER_LOGIN` -- 회원로그인 Primary key
        PRIMARY KEY (
                     `LOGIN_ID` -- 로그인ID
            );

ALTER TABLE `TB_USER_LOGIN`
    MODIFY COLUMN `LOGIN_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '로그인ID';

-- 파일
CREATE TABLE `TB_COMMON_FILE`
(
    `FILE_ID`   BIGINT(20) UNSIGNED NOT NULL COMMENT '파일ID',   -- 파일ID
    `REG_ID`    BIGINT(20) UNSIGNED NOT NULL COMMENT '등록ID',   -- 등록ID
    `REG_DT`    DATETIME            NOT NULL COMMENT '등록일시',   -- 등록일시
    `REG_IP`    VARCHAR(15)         NOT NULL COMMENT '등록아이피',  -- 등록아이피
    `FILE_UUID` CHAR(32)            NOT NULL COMMENT '파일UUID', -- 파일UUID
    `FILE_SIZE` BIGINT(20) UNSIGNED NOT NULL COMMENT '파일크기',   -- 파일크기
    `FILE_NAME` VARCHAR(300)        NOT NULL COMMENT '파일제목',   -- 파일제목
    `FILE_URL`  VARCHAR(300)        NOT NULL COMMENT '파일URL'   -- 파일URL
)
    COMMENT '파일';

-- 파일
ALTER TABLE `TB_COMMON_FILE`
    ADD CONSTRAINT `PK_TB_COMMON_FILE` -- 파일 Primary key
        PRIMARY KEY (
                     `FILE_ID` -- 파일ID
            );

ALTER TABLE `TB_COMMON_FILE`
    MODIFY COLUMN `FILE_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '파일ID';


-- 댓글
CREATE TABLE `TB_COMMON_COMMENT`
(
    `COMMENT_ID`      BIGINT(20) UNSIGNED NOT NULL COMMENT '댓글ID',  -- 댓글ID
    `REG_ID`          BIGINT(20) UNSIGNED NOT NULL COMMENT '등록ID',  -- 등록ID
    `CHG_ID`          BIGINT(20) UNSIGNED NOT NULL COMMENT '수정ID',  -- 수정ID
    `REG_DT`          DATETIME            NOT NULL COMMENT '등록일시',  -- 등록일시
    `CHG_DT`          DATETIME            NOT NULL COMMENT '수정일시',  -- 수정일시
    `REG_IP`          VARCHAR(15)         NOT NULL COMMENT '등록아이피', -- 등록아이피
    `CHG_IP`          VARCHAR(15)         NOT NULL COMMENT '수정아이피', -- 수정아이피
    `COMMENT_TYPE`    VARCHAR(12)         NOT NULL COMMENT '댓글타입',  -- 댓글타입
    `TYPE_ID`         BIGINT(20) UNSIGNED NOT NULL COMMENT '타입ID',  -- 타입ID
    `COMMENT_STATUS`  VARCHAR(12)         NOT NULL COMMENT '댓글상태',  -- 댓글상태
    `COMMENT_RATING`  VARCHAR(12)         NULL COMMENT '댓글평가',      -- 댓글평가
    `COMMENT_IMAGE`   VARCHAR(300)        NULL COMMENT '댓글이미지',     -- 댓글이미지
    `COMMENT_CONTENT` LONGTEXT            NOT NULL COMMENT '댓글내용',  -- 댓글내용
    `PARENT_ID`       BIGINT(20) UNSIGNED NULL COMMENT '부모ID'       -- 부모ID
)
    COMMENT '댓글';

-- 댓글
ALTER TABLE `TB_COMMON_COMMENT`
    ADD CONSTRAINT `PK_TB_COMMON_COMMENT` -- 댓글 Primary key
        PRIMARY KEY (
                     `COMMENT_ID` -- 댓글ID
            );

-- 댓글 Index
CREATE INDEX `IX_TB_COMMON_COMMENT`
    ON `TB_COMMON_COMMENT` ( -- 댓글
                            `COMMENT_TYPE` ASC, -- 댓글타입
                            `REG_DT` DESC, -- 등록일시
                            `TYPE_ID` ASC -- 타입ID
        );

ALTER TABLE `TB_COMMON_COMMENT`
    MODIFY COLUMN `COMMENT_ID` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT '댓글ID';


-- 댓글
ALTER TABLE `TB_COMMON_COMMENT`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_COMMON_COMMENT` -- 회원 -> 댓글
        FOREIGN KEY (
                     `REG_ID` -- 등록ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                ),
    ADD INDEX `FK_TB_USER_TO_TB_COMMON_COMMENT` (
                                                 `REG_ID` ASC -- 등록ID
        );

-- 댓글
ALTER TABLE `TB_COMMON_COMMENT`
    ADD CONSTRAINT `FK_TB_COMMON_COMMENT_TO_TB_COMMON_COMMENT` -- 댓글 -> 댓글
        FOREIGN KEY (
                     `PARENT_ID` -- 부모ID
            )
            REFERENCES `TB_COMMON_COMMENT` ( -- 댓글
                                            `COMMENT_ID` -- 댓글ID
                ),
    ADD INDEX `FK_TB_COMMON_COMMENT_TO_TB_COMMON_COMMENT` (
                                                           `PARENT_ID` ASC -- 부모ID
        );

-- 회원
ALTER TABLE `TB_USER`
    ADD CONSTRAINT `FK_TB_USER_ROLE_TO_TB_USER` -- 회원역할 -> 회원
        FOREIGN KEY (
                     `ROLE_ID` -- 역할ID
            )
            REFERENCES `TB_USER_ROLE` ( -- 회원역할
                                       `ROLE_ID` -- 역할ID
                );

-- 옵션
ALTER TABLE `TB_OPTION`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_OPTION` -- 회원 -> 옵션
        FOREIGN KEY (
                     `REG_ID` -- 등록ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );

-- 옵션
ALTER TABLE `TB_OPTION`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_OPTION2` -- 회원 -> 옵션2
        FOREIGN KEY (
                     `CHG_ID` -- 수정ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );

-

-- 회원역할
ALTER TABLE `TB_USER_ROLE`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_USER_ROLE2` -- 회원 -> 회원역할2
        FOREIGN KEY (
                     `CHG_ID` -- 수정ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );

-- 회원로그인
ALTER TABLE `TB_USER_LOGIN`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_USER_LOGIN` -- 회원 -> 회원로그인
        FOREIGN KEY (
                     `USER_ID` -- 회원ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );

-

-- 파일
ALTER TABLE `TB_COMMON_FILE`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_COMMON_FILE` -- 회원 -> 파일
        FOREIGN KEY (
                     `REG_ID` -- 등록ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );



-- 댓글
ALTER TABLE `TB_COMMON_COMMENT`
    ADD CONSTRAINT `FK_TB_USER_TO_TB_COMMON_COMMENT2` -- 회원 -> 댓글2
        FOREIGN KEY (
                     `CHG_ID` -- 수정ID
            )
            REFERENCES `TB_USER` ( -- 회원
                                  `USER_ID` -- 회원ID
                );

