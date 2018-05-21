package org.mydotey.scf.type;

/**
 * @author koqizhao
 *
 * May 21, 2018
 */
public class StringToLongConverter extends StringConverter<Long> {

    public static StringToLongConverter DEFAULT = new StringToLongConverter();

    public StringToLongConverter() {
        super(Long.class);
    }

    @Override
    public Long convert(String source) {
        return Long.parseLong(source);
    }

}
