package com.google.code.beanmatchers;

import java.lang.reflect.Array;
import java.util.List;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

abstract class AbstractBeanToStringMatcher<T> extends TypeSafeDiagnosingMatcher<Class<T>> {

    final TypeBasedValueGenerator valueGenerator;

    AbstractBeanToStringMatcher(TypeBasedValueGenerator valueGenerator) {
        this.valueGenerator = valueGenerator;
    }

    protected boolean toStringDescribesProperties(Class beanType, List<String> properties, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private boolean resultDoesNotContainValue(String toStringResult, Object value) {
        if (value.getClass().isArray()) {
            for (int i = 0; i < Array.getLength(value); i++) {
                if (resultDoesNotContainValue(toStringResult, Array.get(value, i))) {
                    return true;
                }
            }
            return false;
        } else {
            return !toStringResult.contains(value.toString());
        }
    }

    private Description describeToStringMismatch(Class beanType, Description mismatchDescription) {
        return mismatchDescription.appendText("bean of type ").appendValue(beanType.getName()).appendText(" had an invalid toString() method. ");
    }
}
