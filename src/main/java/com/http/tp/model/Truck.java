package com.http.tp.model;

import javax.persistence.Entity;

import com.sun.istack.NotNull;

@Entity
public class Truck extends Transportation {
@NotNull
private int nbcontainers;

public int getNbcontainers() {
	return nbcontainers;
}

public void setNbcontainers(int nbcontainers) {
	this.nbcontainers = nbcontainers;
}



}
