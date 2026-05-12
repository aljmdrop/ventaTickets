CREATE TABLE recintos (
    id SERIAL PRIMARY KEY,
    sector varchar2(100) NOT NULL,
    fila CHAR(1) NOT NULL,
    asiento integer NOT NULL,
    tipo varchar2(50) NOT NULL
);