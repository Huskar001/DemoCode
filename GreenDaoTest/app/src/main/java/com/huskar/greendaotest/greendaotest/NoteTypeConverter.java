package com.huskar.greendaotest.greendaotest;
import org.greenrobot.greendao.converter.PropertyConverter;
/**
 * Created by Huskar on 2017/8/2.
 */
public class NoteTypeConverter implements PropertyConverter<NoteType, String> {
    @Override
    public NoteType convertToEntityProperty(String databaseValue) {
        return NoteType.valueOf(databaseValue);
    }

    @Override
    public String convertToDatabaseValue(NoteType entityProperty) {
        return entityProperty.name();
    }
}