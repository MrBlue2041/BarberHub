CREATE TABLE barbershops (
    id BIGSERIAL PRIMARY KEY,
    account_id BIGINT NOT NULL,

    name VARCHAR(100) NOT NULL,
    slug VARCHAR(100) NOT NULL UNIQUE,
    description VARCHAR(500),
    phone VARCHAR(20),
    address VARCHAR(255),

    logo_url VARCHAR(255),
    primary_color VARCHAR(20),
    secondary_color VARCHAR(20),

    active BOOLEAN NOT NULL DEFAULT TRUE,

    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,

    CONSTRAINT fk_barbershop_account
        FOREIGN KEY (account_id)
        REFERENCES accounts(id)
);