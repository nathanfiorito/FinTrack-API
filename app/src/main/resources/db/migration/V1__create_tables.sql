CREATE TABLE users (
    id BINARY(16) NOT NULL,
    name VARCHAR(255),
    password VARCHAR(255),
    email VARCHAR(255) UNIQUE,
    PRIMARY KEY (id)
);

CREATE TABLE categories (
    id BINARY(16) NOT NULL,
    name VARCHAR(255),
    description VARCHAR(255),
    PRIMARY KEY (id)
);

CREATE TABLE transactions (
    id BINARY(16) NOT NULL,
    description VARCHAR(255),
    transaction_value DECIMAL(19,2),
    transaction_date DATE,
    transaction_type VARCHAR(50),
    category VARCHAR(255),
    user_id BINARY(16) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT fk_transaction_user FOREIGN KEY (user_id) REFERENCES users(id) ON DELETE CASCADE
);
