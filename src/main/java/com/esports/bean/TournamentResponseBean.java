package com.esports.bean;

import com.esports.entities.TournamentEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TournamentResponseBean extends ResponseBean {
	
	public TournamentResponseBean(TournamentEntity tournamentEntity) {
		super(tournamentEntity);
		this.id =  tournamentEntity.getId();
		this.name = tournamentEntity.getName();
		this.description = tournamentEntity.getDescription();
		this.shortName = tournamentEntity.getShortName();
		this.displayName =  tournamentEntity.getDisplayName();
		this.iconUrl = tournamentEntity.getIconUrl();
	}
	private String name;
	private String displayName;
	private String shortName;
	private String description;
	private String iconUrl;
}
