package com.xworkz.arithmatic;

import java.awt.AWTException;
import java.beans.IntrospectionException;
import java.util.prefs.BackingStoreException;

import javax.management.BadAttributeValueExpException;
import javax.script.ScriptException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.KeySelectorException;

import com.xworkz.arithmatic.EventCreate;

import jdk.jshell.spi.ExecutionControl.UserException;


public class EventStart {

		public static void main(String[] args) throws UserException, XAException, AWTException, BadAttributeValueExpException, 
		                                        BackingStoreException, ScriptException, IntrospectionException, KeySelectorException {
			EventCreate create = new EventCreate();
			create.createExceptionalEvent();
			create.createarrayExceptionalEvent();
			create.createUserExceptionalEvent();
			create.createClassExceptionalEvent();
			create.createXAExceptionalEvent();
			create.createAWTExceptionalEvent();
			create.CannotRedoExceptionalEvent();
			create.UnmodifiableSetExceptionalEvent();
			create. WrongMethodTypeExceptionalEvent();
			create.CompletionExceptionalEvent();
			create.LSExceptionalEvent();
			create.ImagingOpExceptionalEvent();
			create.ProviderExceptionalEvent();
			create.EmptyStackExceptionalEvent();
			create.JMRuntimeExceptionalEvent();
			create.ProfileDataExceptionalEvent();
			create.BackingStoreExceptionalEvent();
			create.BadAttributeValueExpExceptionalEvent();
			create.MalformedParametersExceptionalEvent();
			create.RejectedExecutionExceptionnalEvent();
			create.ScriptExceptionalEvent();
			create.IntrospectionExceptionalEvent();
			create.KeySelectorExceptionalEvent();
		}
}
