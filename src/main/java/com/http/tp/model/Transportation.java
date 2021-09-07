package com.http.tp.model;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Transportation extends Vehicule {
private int loadcapacity;

public int getLoadcapacity() {
	return loadcapacity;
}

public void setLoadcapacity(int loadcapacity) {
	this.loadcapacity = loadcapacity;
}

}
