CREATE TABLE Marca
(
    idMarca             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Cargo
(
    idCargo             int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Especialidad
(
    idEspecialidad      int             primary key auto_increment,
    nombre              varchar(50)     not null,
    habilitado  int not null,
    UNIQUE(nombre)
);

CREATE TABLE Comuna
(
    idComuna            int             primary key auto_increment,
    nombre              varchar(50)     not null,
    UNIQUE(nombre)
);

CREATE TABLE Persona
(
    idPersona           int             primary key auto_increment,
    idCargo             int             null,
    idEspecialidad      int             null,
    idComuna            int             not null,
    rut                 int             not null,
    digito              varchar(1)      not null,
    nombre              varchar(50)     not null,
    apellido            varchar(50)     not null,
    sueldo              int             not null,
    esCliente int not null,
    habilitado  int not null,
    UNIQUE(rut),
    FOREIGN KEY(idCargo)                    REFERENCES Cargo(idCargo),
    FOREIGN KEY(idEspecialidad)                    REFERENCES Especialidad(idEspecialidad),
    FOREIGN KEY(idComuna)                    REFERENCES Comuna(idComuna)
);

CREATE TABLE Vehiculo
(
    idVehiculo          int             primary key auto_increment,
    idPersona           int             not null,
    idMarca             int             not null,
    patente             varchar(6)      not null,
    modelo              varchar(100)    not null,
    litrosMaletero      int             null,
    cantidadPuerta      int             null,
    largoManillar       int             null,
    estilo              varchar(100)    null,
    UNIQUE(patente),
    FOREIGN KEY(idPersona)                    REFERENCES Persona(idPersona),
    FOREIGN KEY(idMarca)                    REFERENCES Marca(idMarca)
);

-- INSERT INTO marca (nombre) VALUES ('hyundai'); 
-- INSERT INTO marca (nombre) VALUES ('toyota'); 
-- INSERT INTO marca (nombre) VALUES ('chebrolet'); 
-- INSERT INTO marca (nombre) VALUES ('audi'); 
-- 
-- 
-- SELECT * FROM marca ORDER BY idMarca ASC;
