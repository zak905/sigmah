package org.sigmah.server.dao;

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

import org.sigmah.server.dao.base.DAO;
import org.sigmah.server.domain.Location;

/**
 * DAO for the {@link org.sigmah.server.domain.Location} domain object.
 * 
 * @author Alex Bertram
 * @author Denis Colliot (dcolliot@ideia.fr)
 */
public interface LocationDAO extends DAO<Location, Integer> {

	/**
	 * Adds a link between the given {@link org.sigmah.server.domain.Location} and the given
	 * {@link org.sigmah.server.domain.AdminEntity AdminEntity}. If a link with another AdminEntity exists belonging to
	 * the same {@link org.sigmah.server.domain.AdminLevel AdminLevel}, it is removed.
	 */
	void updateAdminMembership(int locationId, int adminLevelId, int adminEntityId);

	/**
	 * Adds a link between the given {@link org.sigmah.server.domain.Location Location} and
	 * {@link org.sigmah.server.domain.AdminEntity AdminEntity}.
	 * 
	 * @param locationId
	 * @param adminEntityId
	 */
	void addAdminMembership(int locationId, int adminEntityId);

	/**
	 * Removes the link between the given {@link org.sigmah.server.domain.Location Location} and any
	 * {@link org.sigmah.server.domain.AdminEntity AdminEntity} belonging to the given
	 * {@link org.sigmah.server.domain.AdminLevel}.
	 * 
	 * @param locationId
	 * @param adminLevelId
	 */
	void removeMembership(int locationId, int adminLevelId);

}
