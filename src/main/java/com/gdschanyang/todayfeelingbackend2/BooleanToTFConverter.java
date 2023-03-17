package com.gdschanyang.todayfeelingbackend2;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class BooleanToTFConverter implements AttributeConverter<Boolean, String>  {
    @Override
    public String convertToDatabaseColumn(Boolean attribute) {
        if (attribute != null && attribute) return "T";
        return "F";
    }

    @Override
    public Boolean convertToEntityAttribute(String dbData) {
        return "T".equalsIgnoreCase(dbData);
    }
}
