package com.hexiaofei.provider0.common.nio;

import java.io.IOException;
import java.nio.channels.SelectionKey;

public interface ServerHandlerBs {
    void handleAccept(SelectionKey selectionKey) throws IOException;

    String handleRead(SelectionKey selectionKey) throws IOException;
}
