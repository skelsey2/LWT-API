package com.steveace6.episode;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.steveace6.referencelinks.ReferenceLink;

@Entity
public class LwtEpisode {

	@Id
	private Long id;
	
	private String title;
	
	//date, timestamp etc for air date
	
	private String description;
	
	@OneToMany(mappedBy = "episode", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ReferenceLink> episodeLinks;
	
	/*
	 * Things to possibly hold in future:
	 * 		images (use S3?)
	 * 		call-to-action
	 * 		special guests
	 * 
	 */
	
	public LwtEpisode() {
		super();
		episodeLinks = new ArrayList<>();
	}

	public LwtEpisode(Long id, String title, String description) {
		this();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public LwtEpisode(Long id, String title, String description, List<ReferenceLink> episodeLinks) {
		this();
		this.id = id;
		this.title = title;
		this.description = description;
		this.episodeLinks = episodeLinks;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<ReferenceLink> getEpisodeLinks() {
		return episodeLinks;
	}

	public void setEpisodeLinks(List<ReferenceLink> episodeLinks) {
		this.episodeLinks = episodeLinks;
	}
	
	public void addReferenceLink(ReferenceLink referenceLink){
		referenceLink.setEpisode(this);
		episodeLinks.add(referenceLink);
	}
	
}
