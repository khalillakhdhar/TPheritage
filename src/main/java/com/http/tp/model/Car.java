package com.http.tp.model;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

@Entity
public class Car extends PassengerVehicule {
@NotNull
private int noofdoors;

public int getNoofdoors() {
	return noofdoors;
}

public void setNoofdoors(int noofdoors) {
	this.noofdoors = noofdoors;
}


}
