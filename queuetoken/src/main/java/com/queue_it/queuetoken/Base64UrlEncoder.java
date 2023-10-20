package com.queue_it.queuetoken;

import jakarta.xml.bind.DatatypeConverter;

class Base64UrlEncoder {
    public static String encode(byte[] input) {
        return DatatypeConverter.printBase64Binary(input)
            .replaceAll("\\+", "-")
            .replaceAll("/", "_")
            .replaceAll("=", "");
    }
}
