ALTER TABLE user_profile
ADD COLUMN resume_link varchar(256) NULL;

UPDATE user_profile
SET resume_link = 'https://drive.google.com/file/d/1dgS8HGFDrWRauiH7-YZh0CMer2t1-U0u/view?usp=sharing'
