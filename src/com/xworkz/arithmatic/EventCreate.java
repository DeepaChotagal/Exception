package com.xworkz.arithmatic;



import java.awt.AWTException;
import java.awt.color.ProfileDataException;
import java.awt.image.ImagingOpException;
import java.beans.IntrospectionException;
import java.beans.PropertyVetoException;
import java.lang.invoke.WrongMethodTypeException;
import java.lang.reflect.MalformedParametersException;
import java.security.ProviderException;
import java.util.EmptyStackException;
import java.util.concurrent.CompletionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;

import javax.lang.model.type.MirroredTypesException;
import javax.management.BadAttributeValueExpException;
import javax.management.JMRuntimeException;
import javax.print.attribute.UnmodifiableSetException;
import javax.script.ScriptException;
import javax.swing.text.BadLocationException;
import javax.swing.undo.CannotRedoException;
import javax.transaction.xa.XAException;
import javax.xml.crypto.KeySelectorException;

import org.w3c.dom.ls.LSException;

import jdk.jshell.spi.ExecutionControl.UserException;

public class EventCreate {

	public static void main(String[] args) {
		
			System.out.println("created EventCreator no-arg");
		}
		
		
		public void createExceptionalEvent()
		{
			//No exception of type Integer can be thrown; an exception type must be a subclass of throwable;
			
			ArithmeticException  arithmeticException = new  ArithmeticException();
			throw  arithmeticException;
		}
		
		public void  createarrayExceptionalEvent() throws ArrayStoreException
		{
			 ArrayStoreException  arrayStoreException = new  ArrayStoreException();
			 throw  arrayStoreException;
		}
		
		public void createClassExceptionalEvent()
		{
			ClassCastException classCastException = new ClassCastException();
			throw classCastException;
		}
		
		public void createUserExceptionalEvent() throws UserException 
		{
			UserException  error = new  UserException(null, null, null);
			 throw  error;
		}
		
		public void createXAExceptionalEvent() throws  XAException{
			XAException error = new XAException();
			throw error;
		}
		
		public void createBadLocationExceptionalEvent() throws BadLocationException 
		{
			BadLocationException badLocationException=new BadLocationException("BadLocation", 0);
			throw badLocationException;
		}
		
		public void createAWTExceptionalEvent() throws AWTException 
		{
			 AWTException   aWTException=new  AWTException("sss");
			throw   aWTException;
		}
		
		public void  CannotRedoExceptionalEvent()
		{
			 CannotRedoException  cannotRedoException=new  CannotRedoException();
			 throw  cannotRedoException;
		}
		
		public void UnmodifiableSetExceptionalEvent()
		{
			UnmodifiableSetException unknownEntityException = new UnmodifiableSetException();
			throw unknownEntityException;
		}
		
		public void  WrongMethodTypeExceptionalEvent()
		{
			 WrongMethodTypeException  wrongMethodTypeException = new  WrongMethodTypeException();
			 throw  wrongMethodTypeException;
		}
		

		public void CompletionExceptionalEvent() {
			CompletionException completionException = new CompletionException("type", null);
			throw completionException;
			
		}
		
		public void LSExceptionalEvent() 
		{
			LSException lSException = new LSException((short) 0, "ls");
			throw lSException;
		}
		
		public void ImagingOpExceptionalEvent()
		{
			ImagingOpException imagingOpException = new ImagingOpException("imagine");
			throw imagingOpException;
		}
		
		public void ProviderExceptionalEvent()
		{
			ProviderException providerException = new ProviderException();
			throw providerException;
		}
		
		public void EmptyStackExceptionalEvent()
		{
			EmptyStackException emptyStackException = new EmptyStackException();
			throw emptyStackException;
		}
		
		public void JMRuntimeExceptionalEvent()
		{
			JMRuntimeException jMRuntimeException= new JMRuntimeException();
			throw jMRuntimeException;
		}
		
		public void ProfileDataExceptionalEvent()
		{
			ProfileDataException profileDataException = new ProfileDataException("ddd");
			throw profileDataException;
		}
		
		public void BackingStoreExceptionalEvent() throws BackingStoreException
		{
			BackingStoreException backingStoreException = new BackingStoreException("deepa");
			throw backingStoreException;
		}
		
		public void BadAttributeValueExpExceptionalEvent() throws BadAttributeValueExpException
		{
			BadAttributeValueExpException badAttributeValueExpException = new BadAttributeValueExpException("ttt");
			throw badAttributeValueExpException;
		}
		
		public void  MalformedParametersExceptionalEvent()
		{
			 MalformedParametersException  malformedParametersException = new  MalformedParametersException();
			 throw  malformedParametersException;
		}
		
		public void  RejectedExecutionExceptionnalEvent()
		{
			 RejectedExecutionException  rejectedExecutionException = new   RejectedExecutionException();
			throw  rejectedExecutionException;
		}
		
		public void ScriptExceptionalEvent() throws ScriptException
		{
			ScriptException scriptException = new ScriptException("ttt");
			throw scriptException;
		}
		
		public void IntrospectionExceptionalEvent() throws IntrospectionException
		{
			IntrospectionException IntrospectionException = new IntrospectionException("rrr");
			throw IntrospectionException;	
		}
		
		public  void KeySelectorExceptionalEvent() throws KeySelectorException
		{
			KeySelectorException KeySelectorException = new KeySelectorException();
			throw KeySelectorException;
		}
		

	
		}


	


