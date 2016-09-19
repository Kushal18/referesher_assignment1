//collections represent a group of objects.

package javaReferesher;
import java.io.File;
import java.io.IOException; 
import java.util.ArrayList; 
import java.util.Collection; 
import java.util.HashMap; 
import org.w3c.dom.Document; 
import org.w3c.dom.NodeList; 
import org.xml.sax.SAXException; 
import org.w3c.dom.Node; 
import org.w3c.dom.Element; 
import javax.xml.parsers.DocumentBuilder; 
import javax.xml.parsers.DocumentBuilderFactory; 
import javax.xml.parsers.ParserConfigurationException; 

public class collections {

	public static void main(String[] args) throws InterruptedException{
		ArrayList<String> listOfquestions;
		HashMap<String,String> quiz = new HashMap<String,String>();
		File questionFile = new File("D:/CMPE273/Quiz.xml");
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance(); 
		DocumentBuilder dBuilder; 
		try { 
			   dBuilder = dbFactory.newDocumentBuilder(); 
			   Document doc = dBuilder.parse(questionFile); 
			   NodeList listOfQuestion=doc.getElementsByTagName("question"); 
			   for (int i = 0; i < listOfQuestion.getLength(); i++) { 
			 
			    Node n = listOfQuestion.item(i);    
			    if (n.getNodeType() == Node.ELEMENT_NODE) { 
			 
			     Element ele = (Element) n; 
			     String ques =ele.getElementsByTagName("ques").item(0).getTextContent(); 
			     String ans = ele.getElementsByTagName("ans").item(0).getTextContent(); 
			     quiz.put(ques, ans); 
			    } 
			   } 
			             
			  } catch (ParserConfigurationException e) { 
			   // TODO Auto-generated catch block 
			   e.printStackTrace(); 
			  } catch (SAXException e) { 
			   // TODO Auto-generated catch block 
			   e.printStackTrace(); 
			  } catch (IOException e) { 
			   // TODO Auto-generated catch block 
			   e.printStackTrace(); 
			  } 
		System.out.println("Quiz starts try answering in 5 secs");
		listOfquestions = new ArrayList<>(quiz.keySet());
		for(String question:listOfquestions){
			System.out.println("Ques-1 :"+question); 
			   Thread.sleep(5000); 
			   System.out.println("Ans:"+quiz.get(question)); 
			 	
		}
		
		
	
	}
	
	
}
