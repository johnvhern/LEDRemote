package com.lomi.ledremote;

public class NecIrConverter {

    public static int[] convertHexToPattern(String hexCode) {
        // Clean up the string
        if (hexCode.startsWith("0x")) {
            hexCode = hexCode.substring(2);
        }

        // Parse the hex string into 32-bit binary
        long value = Long.parseUnsignedLong(hexCode, 16);
        String binary = String.format("%32s", Long.toBinaryString(value)).replace(' ', '0');

        // NEC protocol timing constants
        final int HEADER_MARK = 9000;
        final int HEADER_SPACE = 4500;
        final int BIT_MARK = 560;
        final int ONE_SPACE = 1690;
        final int ZERO_SPACE = 560;
        final int STOP_BIT = 560;

        // Create array to hold pattern
        int[] pattern = new int[2 + (binary.length() * 2) + 1]; // header + 32 bits * 2 + stop
        int index = 0;

        // Leader code
        pattern[index++] = HEADER_MARK;
        pattern[index++] = HEADER_SPACE;

        // Data bits
        for (int i = 0; i < binary.length(); i++) {
            pattern[index++] = BIT_MARK;
            pattern[index++] = binary.charAt(i) == '1' ? ONE_SPACE : ZERO_SPACE;
        }

        // Stop bit
        pattern[index] = STOP_BIT;

        return pattern;
    }
}

