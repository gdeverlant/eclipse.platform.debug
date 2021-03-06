/*******************************************************************************
 * Copyright (c) 2008, 2018 Wind River Systems and others.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *     Wind River Systems - initial API and implementation
 *     IBM Corporation - bug fixing
 *******************************************************************************/
package org.eclipse.debug.examples.core.pda.protocol;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Object representing a bit field in the stack command results.
 *
 * @see PDARegistersCommand
 */
public class PDABitFieldData {

    final public String fName;
    final public int fOffset;
    final public int fCount;
	final public Map<String, String> fMnemonics;

    PDABitFieldData(String bitFieldString) {
        StringTokenizer st = new StringTokenizer(bitFieldString, "   "); //$NON-NLS-1$

        fName = st.nextToken();
        fOffset = Integer.parseInt(st.nextToken());
        fCount = Integer.parseInt(st.nextToken());

		fMnemonics = new LinkedHashMap<>(0);
        while (st.hasMoreTokens()) {
            fMnemonics.put(st.nextToken(), st.nextToken());
        }
    }
}