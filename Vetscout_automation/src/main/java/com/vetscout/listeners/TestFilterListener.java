package com.vetscout.listeners;

import java.util.ArrayList;
import java.util.List;
import org.testng.IMethodInstance;
import org.testng.IMethodInterceptor;
import org.testng.ITestContext;

import com.vetscout.base.BaseClass;
 
public class TestFilterListener extends BaseClass implements IMethodInterceptor {
	
    @Override
    public List<IMethodInstance> intercept(List<IMethodInstance> methods, ITestContext context) {
        return methods;
    }
}