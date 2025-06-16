-- Trustt Experience
INSERT INTO experience (
    position, company, start_date, end_date, description, skills, location, is_deleted
) VALUES (
             'Software Engineer',
             'Trustt Formerly (Novopay Solutions Private)',
             '2023-06-01',
             NULL,  -- Current job
             'Orchestrated API integrations with BRMS, developed internal services including barcode reader and PDF generator...',
             'Java,Spring Boot,Microservices,PostgreSQL',
             'Bangalore',
             FALSE
         );

-- Finvolv Experience
INSERT INTO experience (
    position, company, start_date, end_date, description, skills, location, is_deleted
) VALUES (
             'Senior Software Engineer',
             'Finvolv',
             '2021-06-01',  -- Assuming start date before Trustt
             '2023-05-31',  -- Assuming left before joining Trustt
             'Collaborated with software engineers to develop and test application procedures...',
             'Java,Spring Boot,Linux,SQL',
             'Bangalore',
             FALSE
         );