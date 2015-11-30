--/* Procedure for create a new schema user for tests
-- *
-- * The MIT License (MIT)
-- *
-- * Copyright (c) 2010-2015 Senthil Maruthaiappan
-- *
-- *
-- *

DECLARE
  PUSERNAME VARCHAR2(100) := 'TESTUSER_SENJ100';
  PUSERPASSWORD VARCHAR2(100) := 'Happy123';
  C         INT;
BEGIN
 --************************
  --terminate user session
  --************************
  FOR REC IN
  (SELECT s.SID,s.SERIAL# FROM v$session s WHERE s.username = upper(pusername)
  )
  LOOP
    EXECUTE immediate 'alter system kill session ''' || rec.sid || ', ' || rec.serial# || '''' ;
  END LOOP;
  
 --************************  
  --drop the user
   --************************
   
  SELECT COUNT(*)
  INTO c
  FROM all_users
  WHERE username = upper(pusername);
  IF c           = 1 THEN
    EXECUTE immediate 'drop user '||pusername || ' cascade';
  END IF;
  
   --************************
  --create user
   --************************
   
  EXECUTE immediate 'create user ' || pusername || ' identified by ' || puserPassword ;
  EXECUTE immediate 'grant connect, resource to ' || pusername;
  EXECUTE immediate 'grant create table, create session, create view, create any context,create sequence, create trigger, alter session,
                    administer database trigger, create role, create job, create materialized view ,create synonym to '|| pusername;

END;

/
