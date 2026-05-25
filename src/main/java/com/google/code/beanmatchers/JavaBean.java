package com.google.code.beanmatchers;

import static com.google.code.beanmatchers.BeanOperations.instantiateBean;
import static com.google.code.beanmatchers.BeanOperations.invokeGetter;
import static com.google.code.beanmatchers.BeanOperations.invokeSetter;
import static com.google.code.beanmatchers.BeanOperations.propertyDescriptors;
import java.beans.PropertyDescriptor;
import java.util.List;

class JavaBean {

    private final Object targetBean;

    private final PropertyDescriptor[] descriptors;

    public JavaBean(Object targetBean) {
        this.targetBean = targetBean;
        descriptors = propertyDescriptors(targetBean);
    }

    public JavaBean(Class targetBeanType) {
        this(instantiateBean(targetBeanType));
    }

    public Class beanType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Class<?> propertyType(String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setProperty(String propertyName, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object getProperty(String propertyName) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private PropertyDescriptor descriptorForName(String propertyName) {
        for (PropertyDescriptor propertyDescriptor : descriptors) {
            if (propertyDescriptor.getName().equals(propertyName)) {
                return propertyDescriptor;
            }
        }
        throw new BeanMatchersException("No property named '" + propertyName + "' on bean " + targetBean);
    }

    public List<String> properties() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
