package com.flota.dominio;

import java.util.Date;

public interface Reservable {
	
	//public abstract (es lo mismo, todos los interfaces son public y abstract)
	 void reservar(Date fechaReserva);
}
