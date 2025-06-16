CREATE TABLE user_profile (
                              id BIGSERIAL,
                              name VARCHAR(255) NOT NULL,
                              title VARCHAR(255),
                              tagline VARCHAR(255),
                              bio TEXT,
                              phone VARCHAR(255),
                              email VARCHAR(255),
                              website VARCHAR(255),
                              designation VARCHAR(255),
                              github VARCHAR(255),
                              linkedin VARCHAR(255),
                              is_active BOOLEAN DEFAULT TRUE,
                              created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
                              PRIMARY KEY (id)
);