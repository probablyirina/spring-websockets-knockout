/*
 * Copyright 2002-2013 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package rs.enetel.service;

public class RandomDelay {

	private final Long trainId;

	private final int randomDelayInMinutes;


	public RandomDelay(Long trainId, int randomDelayInMinutes) {
		this.trainId = trainId;
		this.randomDelayInMinutes = randomDelayInMinutes;
	}

	public Long getTrainId() {
		return trainId;
	}

	public int getRandomDelayInMinutes() {
		return randomDelayInMinutes;
	}

	@Override
	public String toString() {
		return "Random delay [train=" + trainId + ", delay=" + randomDelayInMinutes + "]";
	}
}