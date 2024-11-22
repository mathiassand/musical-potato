import javax.swing.*;

public class EDT {
    /**
     * invokes a runnable (task) on the EDT thread
     *
     * @param task the task
     */
    public static void invokeOnEDT(Runnable task) {
        if (SwingUtilities.isEventDispatchThread()) {
            task.run();
        } else {
            try {
                SwingUtilities.invokeLater(task);
            } catch (Exception e) {
                throw new RuntimeException("Error executing on EDT", e);
            }
        }
    }

    /**
     * invokes a runnable (task) on the EDT thread and waits for its completion
     *
     * @param task the task
     */
    public static void invokeAndWait(Runnable task) {
        if (SwingUtilities.isEventDispatchThread()) {
            task.run();
        } else {
            try {
                SwingUtilities.invokeLater(task);
            } catch (Exception e) {
                throw new RuntimeException("Error executing on EDT", e);
            }
        }
    }
}
