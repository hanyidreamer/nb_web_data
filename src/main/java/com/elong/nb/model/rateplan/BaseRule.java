package com.elong.nb.model.rateplan;

public class BaseRule {
	/// <summary>
    /// 描述
    /// </summary>
    private String Description ;

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

    /*
    public List<DictionaryEntry> Values
    {
        get
        {
            List<DictionaryEntry> result = new List<DictionaryEntry>();
            foreach (var prop in this.GetType().GetProperties())
            {
                if (prop.GetCustomAttributes(false).Any(attr => attr.GetType() == typeof(System.Xml.Serialization.XmlIgnoreAttribute)))
                {
                    result.Add(new DictionaryEntry(prop.Name, prop.GetValue(this, null)));
                }
            }
            return result;                
        }
    }
     */

}
