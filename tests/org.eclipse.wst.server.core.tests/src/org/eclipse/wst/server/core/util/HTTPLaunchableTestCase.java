/*******************************************************************************
 * Copyright (c) 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - Initial API and implementation
 *******************************************************************************/
package org.eclipse.wst.server.core.util;

import org.eclipse.wst.server.core.tests.OrderedTestSuite;
import junit.framework.Test;
import junit.framework.TestCase;

public class HTTPLaunchableTestCase extends TestCase {
	protected static HttpLaunchable launch;
	
	public static Test suite() {
		return new OrderedTestSuite(HTTPLaunchableTestCase.class, "HTTPLaunchableTestCase");
	}

	public void test00Create() {
		launch = new HttpLaunchable(null);
	}
	
	public void test01GetURL() {
		assertNull(launch.getURL());
	}
	
	public void test02ToString() {
		try {
			launch.toString();
		} catch (Exception e) {
			// ignore
		}
	}
}