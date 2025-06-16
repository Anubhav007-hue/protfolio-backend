CREATE TABLE projects (
                          id BIGSERIAL,
                          title VARCHAR(255) NOT NULL,
                          description TEXT NOT NULL,
                          skills TEXT,
                          link VARCHAR(512),
                          image_url VARCHAR(512),
                          is_deleted BOOLEAN DEFAULT FALSE,
                          created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                          PRIMARY KEY (id)
) ;