create database Hotel_amb_encant; 

use Hotel_amb_encant;

create table Hotel( 
	NomHotel text,
	Idhotel varchar(20),
	Primary key(Idhotel)
);

create table Habitaciones( 
	NumHabitaciones int,
	Idhabitaciones varchar(20),
	Idhotel varchar(20),
	Idreservas varchar(20),
	Primary key(Idhabitaciones),
	FOREIGN KEY(Idhotel) REFERENCES Hotel(Idhotel)
);

create table Reservas( 
	NumReservasDisponibles int,
	Idreservas varchar(20),
	Idfacturas varchar(20),
	Idhabitaciones varchar(20),
	Primary key(Idreservas),
	FOREIGN KEY(Idhabitaciones) REFERENCES Habitaciones(Idhabitaciones)
);

create table Facturas( 
	pendiente text,
	pagada text,
	impagada text,
	NumeroDeFactura int,
	Idreservas varchar(20),
	Idfacturas varchar(20), 
	Primary key(Idfacturas),
	FOREIGN KEY(Idreservas) REFERENCES Reservas(Idreservas)
);


create table clientes( 
	nombre text,
	apellido text,
	DNI text,
	domicilio text,
	poblacion text,
	CodigoPostal varchar(20),
	Idreservas varchar(20),
	Idclientes varchar(20),
	Idfacturas varchar(20),
	Primary key(Idclientes),
	FOREIGN KEY(Idreservas) REFERENCES Reservas(Idreservas),
	FOREIGN KEY(Idfacturas) REFERENCES Facturas(Idfacturas)
);


commit;
