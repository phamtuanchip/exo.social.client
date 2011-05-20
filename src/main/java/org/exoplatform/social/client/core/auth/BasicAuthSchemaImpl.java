/*
 * Copyright (C) 2003-2011 eXo Platform SAS.
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Affero General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see<http://www.gnu.org/licenses/>.
 */
package org.exoplatform.social.client.core.auth;

import javax.naming.directory.BasicAttribute;

import org.exoplatform.social.client.api.auth.AuthSchema;

/**
 * The basic authentication schema requiring username and password.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since  May 20, 2011
 */
public class BasicAuthSchemaImpl implements AuthSchema {

  /**
   * The username
   */
  private String username;

  /**
   * The password
   */
  private String password;

  /**
   * Constructor for basic authentication schema.
   *
   * @param username the user name
   * @param password the password
   */
  public BasicAuthSchemaImpl(String username, String password) {
    this.username = username;
    this.password = password;
  }


  /**
   * {@inheritDoc}
   */
  public boolean isAuthenticated() {
    //TODO implement this
    return false;
  }

}
