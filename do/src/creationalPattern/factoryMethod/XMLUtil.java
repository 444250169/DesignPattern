/**
 * heyzen.club Inc.
 * Copyright (c) 2018-2019 All Rights Reserved.
 */
package creationalPattern.factoryMethod;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import java.io.*;

/**
 * @author Zen
 * @version 1.0: XMLUtil.java, v 0.1 2019/08/21 17:43 Zen Exp $
 */
public class XMLUtil {
    //�÷������ڴ�XML�����ļ�����ȡ������������������һ��ʵ������
    public static Object getBean()
    {
        try
        {
            //�����ĵ�����
            DocumentBuilderFactory dFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dFactory.newDocumentBuilder();
            Document doc;
            doc = builder.parse(new File("E:\\CodeFile\\DesignPattern\\do\\src\\creationalPattern\\factoryMethod\\config.xml"));

            //��ȡ�����������ı��ڵ�
            NodeList nl = doc.getElementsByTagName("className");
            Node classNode=nl.item(0).getFirstChild();
            String cName=classNode.getNodeValue();

            //ͨ����������ʵ�����󲢽��䷵��
            //����Ҫ���ϰ�����
            Class c=Class.forName("creationalPattern.factoryMethod."+cName);
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