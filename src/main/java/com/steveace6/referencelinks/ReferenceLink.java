package com.steveace6.referencelinks;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.steveace6.episode.LwtEpisode;

@Entity
public class ReferenceLink {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String referenceLink;
	
	@ManyToOne
	private LwtEpisode episode;
	
	public ReferenceLink() {}
	
	
	
	public ReferenceLink(String referenceLink) {
		super();
		this.referenceLink = referenceLink;
	}
	public ReferenceLink(Long id, String referenceLink) {
		super();
		this.id = id;
		this.referenceLink = referenceLink;
	}
	public ReferenceLink(Long id, String referenceLink, LwtEpisode episode) {
		super();
		this.id = id;
		this.referenceLink = referenceLink;
		this.episode = episode;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getReferenceLink() {
		return referenceLink;
	}

	public void setReferenceLink(String referenceLink) {
		this.referenceLink = referenceLink;
	}
	
	
	
	public LwtEpisode getEpisode() {
		return episode;
	}



	public void setEpisode(LwtEpisode episode) {
		this.episode = episode;
	}



	@Override
	public String toString() {
		return "ReferenceLink [id=" + id + ", referenceLink=" + referenceLink + "]";
	}
	
	
}
