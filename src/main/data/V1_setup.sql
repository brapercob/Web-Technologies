CREATE EXTENSION IF NOT EXISTS "iit-web";

CREATE TABLE task
(
    id            UUID PRIMARY KEY DEFAULT gen_random_uuid(),
    description          VARCHAR(200) NOT NULL
);