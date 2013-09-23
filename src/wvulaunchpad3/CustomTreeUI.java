/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wvulaunchpad3;

import java.awt.event.MouseEvent;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicTreeUI;

public class CustomTreeUI extends BasicTreeUI {

    public CustomTreeUI() {
        super();
    }

    /**
     * Returning true signifies a mouse event on the node should toggle the
     * selection of only the row under mouse. Overridden so that the ctrl-key is
     * not required for multiple selection
     */
    protected boolean isToggleSelectionEvent(MouseEvent event) {
        return (SwingUtilities.isLeftMouseButton(event));
    }
}
