package org.sigmah.shared;

/*
 * #%L
 * Sigmah
 * %%
 * Copyright (C) 2010 - 2016 URD
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program.  If not, see
 * <http://www.gnu.org/licenses/gpl-3.0.html>.
 * #L%
 */

import org.sigmah.client.i18n.I18N;
import org.sigmah.client.util.ClientUtils;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * <p>
 * Application available languages.
 * </p>
 * <p>
 * I18N resources (constants, mails, etc.) are generated for these available languages.<br>
 * If a new language should be supported by the application, make sure to update this enum.
 * </p>
 * <p>
 * See server-side {@link org.sigmah.server.util.Languages} utility class.
 * </p>
 * 
 * @author Denis Colliot (dcolliot@ideia.fr)
 */
public enum Language implements IsSerializable {

	// Enum's 'getLocale()' MUST return a valid "java.util.Locale" language parameter.

	// Enum values order defines the LoginView form field order.

	/**
	 * French language.
	 */
	FR,

	/**
	 * English language.
	 */
	EN,

	/**
	 * Spanish language.
	 */
	ES;

	/**
	 * Returns the current {@link Language} corresponding <em>locale</em> name.<br>
	 * The returned value is compatible with {@link java.util.Locale#Locale(String)} constructor.
	 * 
	 * @return The current {@link Language} corresponding <em>locale</em> name.
	 */
	public String getLocale() {
		if (this == EN) {
			return "en_GB";
		} else {
		return name().toLowerCase();
	}
	}

	/**
	 * Returns the given locale {@code value} corresponding {@link Language} instance.
	 * 
	 * @param value
	 *          The locale value (trimmed during process).<br/>
	 *          Case insensitive.
	 * @return The given locale {@code value} corresponding {@link Language} instance, or {@code null}.
	 */
	public static Language fromString(final String value) {
		
		if ("en_GB".equals(value)) {
			return EN;
		}
		try {

			return Language.valueOf(ClientUtils.trimToEmpty(value).toUpperCase());

		} catch (final Exception e) {
			return null;
		}
	}

	/**
	 * Returns the given {@code language} corresponding i18n name.<br>
	 * This method should be executed from client-side. If executed from server-side, it returns the enum constant name.
	 * 
	 * @param language
	 *          The language.
	 * @return The given {@code language} corresponding i18n name, or {@code null}.
	 */
	public static final String i18n(final Language language) {

		if (language == null) {
			return null;
		}

		if (!GWT.isClient()) {
			return language.name();
		}

		switch (language) {
			case FR:
				return I18N.CONSTANTS.languageFrench();
			case EN:
				return I18N.CONSTANTS.languageEnglish();
			case ES:
				return I18N.CONSTANTS.languageSpanish();
			default:
				return language.name();
		}
	}

	/**
	 * Returns the given {@code i18n} value corresponding language instance.<br>
	 * This method should be executed from client-side. If executed from server-side, it returns {@code null}.
	 * 
	 * @param i18n
	 *          The {@code i18n} language value.
	 * @return The given {@code i18n} value corresponding language instance, or {@code null}.
	 */
	public static final Language fromI18n(final String i18n) {

		if (!GWT.isClient()) {
			return null;
		}

		if (I18N.CONSTANTS.languageFrench().equals(i18n)) {
			return FR;

		} else if (I18N.CONSTANTS.languageEnglish().equals(i18n)) {
			return EN;

		} else if (I18N.CONSTANTS.languageSpanish().equals(i18n)) {
			return ES;

		} else {
			return null;
		}
	}

}
