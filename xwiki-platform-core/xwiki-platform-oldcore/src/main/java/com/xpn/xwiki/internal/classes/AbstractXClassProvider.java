/*
 * See the NOTICE file distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package com.xpn.xwiki.internal.classes;

import org.xwiki.component.phase.Initializable;
import org.xwiki.component.phase.InitializationException;

import com.xpn.xwiki.objects.classes.BaseClass;
import com.xpn.xwiki.objects.classes.XClassProvider;

/**
 * Base class for standard class providers.
 * 
 * @version $Id$
 * @since 4.3M1
 */
public abstract class AbstractXClassProvider implements XClassProvider, Initializable
{
    /**
     * The standard class.
     */
    private BaseClass bclass;

    @Override
    public void initialize() throws InitializationException
    {
        this.bclass = new BaseClass();

        initialize(this.bclass);
    }

    protected abstract void initialize(BaseClass bclass) throws InitializationException;

    @Override
    public BaseClass getXClass()
    {
        return this.bclass;
    }
}
