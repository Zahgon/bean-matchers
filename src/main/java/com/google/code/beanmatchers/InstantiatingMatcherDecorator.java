package com.google.code.beanmatchers;

import static com.google.code.beanmatchers.BeanOperations.instantiateBean;
import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;

public class InstantiatingMatcherDecorator<T> extends TypeSafeMatcher<Class<T>> {

    private final Matcher<T> delegateMatcher;

    public InstantiatingMatcherDecorator(Matcher<T> matcher) {
        this.delegateMatcher = matcher;
    }

    @Override
    protected boolean matchesSafely(Class<T> beanType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void describeMismatchSafely(Class<T> beanType, Description mismatchDescription) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void describeTo(Description description) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
