import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;
public class XMLUtil
{
//�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
	public static Object getBean()
	{
		try
		{
			//�����ĵ�����
			DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = dFactory.newDocumentBuilder();
			Document doc;							
			doc = builder.parse(new File("config.xml")); 
//			NodeList nl=null;
//			Node classNode=null;
//			String cName=null;
//			nl = doc.getElementsByTagName("className");
//			
//			if(args.equals("color"))
//			{
//				//��ȡ�����������ı��ڵ�
//	            classNode=nl.item(0).getFirstChild();
//	            
//			}
//			else if(args.equals("pen"))
//			{
			   //��ȡ�����������ı��ڵ�
//	            classNode=nl.item(1).getFirstChild();
//			}
//			
//	         cName=classNode.getNodeValue();
	         //ͨ����������ʵ�����󲢽��䷵��
			NodeList nl=doc.getElementsByTagName("className");
			Node classNode=nl.item(0).getFirstChild();
			String cName=classNode.getNodeValue();
	         Class c=Class.forName(cName);
             Object obj=c.newInstance();
	         return obj;		
           }   
           	catch(Exception e)
           	{
           		e.printStackTrace();
           		return null;
           	}
		}
}