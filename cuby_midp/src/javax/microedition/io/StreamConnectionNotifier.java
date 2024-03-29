
package javax.microedition.io;

import java.io.*;

/**
 * This interface defines the capabilities that a connection notifier
 * must have.
 *
 * @version 03/13/02 (CLDC 1.1)
 * @since   CLDC 1.0
 */
public interface StreamConnectionNotifier extends Connection {
    /**
     * Returns a <code>StreamConnection</code> object that represents
     * a server side socket connection.  The method blocks until
     * a connection is made.
     *
     * @return  A <code>StreamConnection</code> to communicate with a client.
     * @exception  IOException  If an I/O error occurs.
     */
    public StreamConnection acceptAndOpen() throws IOException;
}
