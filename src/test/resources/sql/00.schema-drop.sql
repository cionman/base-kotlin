/**
 * 데이터베이스로부터 테이블이름 가져와서 삭제하는 방식으로 변경
 * 더이상 삭제 테이블 추가할 필요 없음
 */

SET FOREIGN_KEY_CHECKS=0;
SET group_concat_max_len = 1000000;

DROP TABLE IF EXISTS LINA_TMP;
CREATE TABLE LINA_TMP (ID BIGINT(20) UNSIGNED NOT NULL);

SET @tables = NULL;
SELECT GROUP_CONCAT(table_schema, '.', table_name) INTO @tables
FROM information_schema.tables
WHERE table_schema = 'lina';

SET @tables = CONCAT('DROP TABLE ', @tables);
PREPARE stmt FROM @tables;
EXECUTE stmt;
DEALLOCATE PREPARE stmt;

SET FOREIGN_KEY_CHECKS=1;
