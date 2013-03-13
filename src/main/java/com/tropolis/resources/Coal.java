package com.tropolis.resources;

public class Coal implements IResource {
	private final String RESOURCE_NAME = "Coal";
	
	private Long volume;


	@Override
	public String getName() {
		return RESOURCE_NAME;
	}

	@Override
	public void setVolume(Long volume) {
		this.volume = volume;
	}

	@Override
	public Long getVolume() {
		return volume;	
	}
	

}
