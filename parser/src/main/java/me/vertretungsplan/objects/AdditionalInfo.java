/*
 * substitution-schedule-parser - Java library for parsing schools' substitution schedules
 * Copyright (c) 2016 Johan v. Forstner
 *
 * This Source Code Form is subject to the terms of the Mozilla Public License, v. 2.0.
 * If a copy of the MPL was not distributed with this file, You can obtain one at https://mozilla.org/MPL/2.0/.
 */

package me.vertretungsplan.objects;

public class AdditionalInfo {

	private String title;
	private String text;
	private boolean hasInformation;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean hasInformation() {
		return hasInformation;
	}

	@SuppressWarnings("SameParameterValue")
	public void setHasInformation(boolean hasInformation) {
		this.hasInformation = hasInformation;
	}

	@SuppressWarnings("NegatedConditionalExpression")
	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		AdditionalInfo that = (AdditionalInfo) o;

		if (hasInformation != that.hasInformation) return false;
		if (title != null ? !title.equals(that.title) : that.title != null) return false;
		return !(text != null ? !text.equals(that.text) : that.text != null);

	}

	@Override
	public int hashCode() {
		int result = title != null ? title.hashCode() : 0;
		result = 31 * result + (text != null ? text.hashCode() : 0);
		result = 31 * result + (hasInformation ? 1 : 0);
		return result;
	}
}
