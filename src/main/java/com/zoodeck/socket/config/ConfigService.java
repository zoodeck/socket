package com.zoodeck.socket.config;

import java.net.InetSocketAddress;

public interface ConfigService {
    int getSocketPort();
    InetSocketAddress getSocketAddress();
    String getHost();
    String getUsername();
    String getPassword();
}
