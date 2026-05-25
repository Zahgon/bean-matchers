package com.google.code.beanmatchers;

import static java.util.Arrays.asList;
import java.util.List;
import org.hamcrest.Description;

public class HasValidGettersAndSettersExcludingMatcher<T> extends AbstractBeanAccessorMatcher<T> {

    private List<String> excludedProperties;

    HasValidGettersAndSettersExcludingMatcher(TypeBasedValueGenerator valueGenerator, String... excludedProperties) {
        super(valueGenerator);
        this.excludedProperties = asList(excludedProperties);
    }

    @Override
    protected boolean matches(Object item, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
