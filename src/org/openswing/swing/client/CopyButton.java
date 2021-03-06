package org.openswing.swing.client;

import java.awt.*;
import javax.swing.*;

import org.openswing.swing.util.client.*;


/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Edit button, linked to GridControl or Form components.</p>
 * <p>Copyright: Copyright (C) 2006 Mauro Carniel</p>
 *
 * <p> This file is part of OpenSwing Framework.
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the (LGPL) Lesser General Public
 * License as published by the Free Software Foundation;
 *
 *                GNU LESSER GENERAL PUBLIC LICENSE
 *                 Version 2.1, February 1999
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Library General Public License for more details.
 *
 * You should have received a copy of the GNU Library General Public
 * License along with this library; if not, write to the Free
 * Software Foundation, Inc., 675 Mass Ave, Cambridge, MA 02139, USA.
 *
 *       The author may be contacted at:
 *           maurocarniel@tin.it</p>
 *
 * @author Mauro Carniel
 * @version 1.0
 */
public class CopyButton extends GenericButton {

  public CopyButton() {
    super(new ImageIcon(ClientUtils.getImage(ClientSettings.BUTTON_COPY_IMAGE_NAME)));
  }


  /**
   * Execute the edit operation.
   * @param controller: data controller that contains the edit logic.
   */
  protected final void executeOperation(DataController controller) throws Exception {
    try {
      controller.copy();
    }
    catch (Exception ex) {
      ex.printStackTrace();
    }
  }


}
