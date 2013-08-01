/**
 * 
 */
package org.ey.wx.honeybee.message.transform;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.Templates;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMResult;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;

import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author Edison Yang
 * @date 2013-AUG-01
 */
public class XSLTTransformer {
	private File xsltFile;
	
	public void setXsltFile(File xsltFile) {
		this.xsltFile = xsltFile;
	}


	public String transformMessage(String message){
		Transformer xsltTransformer = null;
		Source xsltSource = null;
		Templates xsltTemplate = null;
		
		try {
			xsltSource = new StreamSource(new FileInputStream(xsltFile));
			xsltTemplate = TransformerFactory.newInstance().newTemplates(xsltSource);
			xsltTransformer = xsltTemplate.newTransformer();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerFactoryConfigurationError e) {
			e.printStackTrace();
		}
		
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FactoryConfigurationError e) {
			e.printStackTrace();
		}
		
		InputSource is = new InputSource();
		is.setCharacterStream(new StringReader(message));
		Document doc = null;
		try {
			doc = documentBuilder.parse(is);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Source domSource = new DOMSource(doc);
		DOMResult domResult = new DOMResult();
		
		try {
			xsltTransformer.transform(domSource, domResult);
		} catch (TransformerException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	
}
