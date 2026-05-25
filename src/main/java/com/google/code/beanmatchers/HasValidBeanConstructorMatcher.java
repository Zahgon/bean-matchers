package com.google.code.beanmatchers;

import static com.google.code.beanmatchers.BeanOperations.noArgsConstructor;
import org.hamcrest.Description;
import org.hamcrest.TypeSafeDiagnosingMatcher;

public class HasValidBeanConstructorMatcher extends TypeSafeDiagnosingMatcher<Class> {

    @Override
    protected boolean matchesSafely(Class item, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
