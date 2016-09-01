
package com.elong.nb.agent.ProductForSearchServiceForRealTimeCheck;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;

import com.elong.nb.util.XsdDateTimeConverter;

public class Adapter2
    extends XmlAdapter<String, DateTime>
{


    public DateTime unmarshal(String value) {
        return (XsdDateTimeConverter.unmarshal(value));
    }

    public String marshal(DateTime value) {
        return (XsdDateTimeConverter.marshal(value));
    }

}
