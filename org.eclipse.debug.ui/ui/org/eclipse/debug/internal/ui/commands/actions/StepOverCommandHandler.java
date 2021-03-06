/*******************************************************************************
 * Copyright (c) 2011, 2013 Wind River Systems and others.
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
 *******************************************************************************/
package org.eclipse.debug.internal.ui.commands.actions;

import org.eclipse.debug.core.commands.IStepOverHandler;
import org.eclipse.debug.ui.actions.DebugCommandHandler;

/**
 * Default handler for command.  It ensures that the keyboard accelerator works even
 * if the menu action set is not enabled.
 *
 * @since 3.8
 */
public class StepOverCommandHandler extends DebugCommandHandler {

    @Override
	protected Class<IStepOverHandler> getCommandType() {
        return IStepOverHandler.class;
    }

}
