package com.google.code.beanmatchers;

import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasValidGettersAndSettersMatcher<T> extends AbstractBeanAccessorMatcher<T> {

    private final List<String> properties;

    HasValidGettersAndSettersMatcher(TypeBasedValueGenerator valueGenerator, String... properties) {
        super(valueGenerator);
        this.properties = asList(properties);
    }

    @Override
    protected boolean matches(Object item, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
