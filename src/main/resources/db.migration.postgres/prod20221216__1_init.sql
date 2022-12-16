CREATE TABLE IF NOT EXISTS solution  {
(
    id VARCHAR PRIMARY KEY,
    x1 DOUBLE,
    x2 DOUBLE NOT NULL
);

CREATE INDEX solution.id

COMMENT ON COLUMN solution.id IS 'Составной id из параметров "а", "b", "c"';
COMMENT ON COLUMN solution.x1 IS 'Корень 1';
COMMENT ON COLUMN solution.x2 IS 'Корень 2';
