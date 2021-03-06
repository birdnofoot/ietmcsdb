package org.openswing.swing.pivottable.functions.java;

import java.io.Serializable;

/**
 * <p>Title: OpenSwing Framework</p>
 * <p>Description: Function applied to a data field of a pivot table:
 * it reports the average of all values that match the row/column fields criteria.</p>
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
public class AverageFunction extends GenericFunction implements Serializable {

  private Double sum;


  public AverageFunction() {
  }


  public void processValue(Object value) {
    if (value!=null && value instanceof Number) {
      super.processValue(value);
      if (sum==null)
        sum = new Double( ((Number)value).doubleValue() );
      else
        sum = new Double(sum.doubleValue()+((Number)value).doubleValue());
    }
  }


  public Double getValue() {
    if (sum!=null && super.getValue()!=null)
      return new Double(sum.doubleValue()/super.getValue().doubleValue());
    return null;
  }


}
