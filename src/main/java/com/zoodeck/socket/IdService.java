package com.zoodeck.socket;

import java.time.Instant;
import java.util.UUID;

public class IdService {
    public static String generateId() {
        return String.format("%s-%s", Instant.now().toEpochMilli(), UUID.randomUUID());
    }
}
