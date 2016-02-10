package org.sigmah.shared.command;

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

import org.sigmah.shared.command.result.ListResult;
import org.sigmah.shared.dto.MapIconDTO;

/**
 * Returns a list of available {@code org.sigmah.shared.report.model.MapIcon}s on the server
 *
 * @author Alex Bertram (v1.3)
 * @author Denis Colliot (dcolliot@ideia.fr) (v2.0)
 */
public class GetMapIcons extends GetListCommand<ListResult<MapIconDTO>> {

	public GetMapIcons() {
		// Serialization.
	}

}
