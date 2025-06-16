
CREATE TABLE experience (
                            id BIGSERIAL,
                            position VARCHAR(255) NOT NULL,
                            company VARCHAR(255) NOT NULL,
                            start_date DATE NOT NULL,  -- Changed to DATE type
                            end_date DATE,             -- Changed to DATE type
                            description TEXT,
                            skills TEXT,               -- Consider JSON for skills array
                            location VARCHAR(255),
                            is_deleted BOOLEAN DEFAULT TRUE,
                            created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                            PRIMARY KEY (id)
);