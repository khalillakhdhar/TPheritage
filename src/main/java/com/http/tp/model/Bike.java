package com.http.tp.model;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

import com.sun.istack.NotNull;
@Entity
public class Bike extends PassengerVehicule {
@NotNull
@Min(1)
private int saddleheight;

public int getSaddleheight() {
	return saddleheight;
}

public void setSaddleheight(int saddleheight) {
	this.saddleheight = saddleheight;
}






}
