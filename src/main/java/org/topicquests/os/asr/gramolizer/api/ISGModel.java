/**
 * Copyright 2019, TopicQuests Foundation
 *  This source code is available under the terms of the Affero General Public License v3.
 *  Please see LICENSE.txt for full license terms, including the availability of proprietary exceptions.
 */
package org.topicquests.os.asr.gramolizer.api;

import org.topicquests.support.api.IResult;

/**
 * @author jackpark
 *
 */
public interface ISGModel {

	/**
	 * Process wordgrams for this sentence
	 * @param sentenceId
	 * @param sentenceText
	 * @return a list of wordGramIds made for the input
	 */
	IResult processSentence(String sentenceId, String sentenceText);
	
}
