package com.http.tp.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class PassengerVehicule extends Vehicule {
private int noofpassengers;

public int getNoofpassengers() {
	return noofpassengers;
}

public void setNoofpassengers(int noofpassengers) {
	this.noofpassengers = noofpassengers;
}




}
