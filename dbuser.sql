
 CREATE TABLE USER_TBL
 (
    USERID  VARCHAR2(50)    NOT NULL, PRIMARY KEY(USERID),
    USERPW  VARCHAR2(50)    NOT NULL,
    EMAIL   VARCHAR2(100),
    NAME    VARCHAR2(50)
 );
 
 SELECT * FROM user_tbl;
 
 INSERT INTO user_tbl VALUES
 ('hongsi', '0722', 'hs@gmail.com', '��ȫ��');
 INSERT INTO user_tbl VALUES
 ('wangdon', '0205', 'wd@gmail.com', '���յ�');
 INSERT INTO user_tbl VALUES
 ('cis', '0324', 'cis@gmail.com', '���̼�');
 commit;
