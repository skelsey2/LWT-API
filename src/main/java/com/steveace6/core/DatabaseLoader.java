package com.steveace6.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import com.steveace6.episode.LwtEpisode;
import com.steveace6.episode.LwtEpisodeRepository;
import com.steveace6.referencelinks.ReferenceLink;
import com.steveace6.referencelinks.ReferenceLinkRepository;

@Component
public class DatabaseLoader implements ApplicationRunner {

	@Autowired
	LwtEpisodeRepository epiRepo;
	
	@Autowired
	ReferenceLinkRepository  refLinkRepo;
	
	@Override
	public void run(ApplicationArguments arg0) throws Exception {

		
		LwtEpisode one = new LwtEpisode(new Long(1),"first episode","awesome story");
		one.addReferenceLink(new ReferenceLink("http://www.google.com"));
		one.addReferenceLink(new ReferenceLink("http://www.facebook.com"));
		
		LwtEpisode two = new LwtEpisode(new Long(2),"second episode","another story");
		two.addReferenceLink(new ReferenceLink("http://www.g.com"));
		two.addReferenceLink(new ReferenceLink("http://www.fb.com"));
		List<LwtEpisode> episodeList = Arrays.asList(
					one,two
				);

		
//		refLinkRepo.save(referenceLinks);
		epiRepo.save(episodeList);
	}

	
	
}
