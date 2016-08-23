
package com.elong.nb.agent.ProductForPartnerServiceContract;

import javax.xml.bind.annotation.adapters.XmlAdapter;

import org.joda.time.DateTime;

import com.elong.nb.util.XsdDateTimeConverter;

public class Adapter2
    extends XmlAdapter<String, DateTime>
{


    @Override
	public DateTime unmarshal(String value) {
        return (XsdDateTimeConverter.unmarshal(value));
    }

    @Override
	public String marshal(DateTime value) {
        return (XsdDateTimeConverter.marshal(value));
    }

}
