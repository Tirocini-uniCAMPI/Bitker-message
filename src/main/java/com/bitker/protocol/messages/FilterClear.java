package com.bitker.protocol.messages;

import com.bitker.protocol.bitio.LittleEndianInputStream;
import com.bitker.protocol.bitio.LittleEndianOutputStream;

import java.io.IOException;

/**
 * Created by Matteo on 08/10/2016.
 *
 */
public class FilterClear extends Message {


    @Override
    public String getCommand() {
        return "filterclear";
    }

    @Override
    public void read(LittleEndianInputStream leis) throws IOException {

    }

    @Override
    public void write(LittleEndianOutputStream leos) throws IOException {

    }
}