CREATE TABLE certificate (
                             id BIGSERIAL PRIMARY KEY,
                             name VARCHAR(255) NOT NULL,
                             link VARCHAR(255) NOT NULL,
                             image_url VARCHAR(512),
                             is_deleted BOOLEAN DEFAULT FALSE
);