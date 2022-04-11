CREATE EXTENSION IF NOT EXISTS "uuid-ossp";

CREATE TABLE IF NOT EXISTS parking_spot (
    id VARCHAR(36) PRIMARY KEY,
    parking_lot_size VARCHAR(32),
    parking_status VARCHAR(32),
    spot_name VARCHAR(32));