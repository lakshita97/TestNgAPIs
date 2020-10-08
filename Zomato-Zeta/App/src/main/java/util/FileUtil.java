package util;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import sun.security.krb5.internal.crypto.Des;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class FileUtil {
    private String filePath = System.getProperty("user.dir") + "/src/main/resources/userInfo.csv";

    public void writeDate(File filePath, String header[], ArrayList<String[]> dataList) {
        try {
            FileWriter outputFile = new FileWriter(filePath, true);
            CSVWriter writer = new CSVWriter(outputFile, CSVWriter.DEFAULT_SEPARATOR, CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeNext(header);
            writer.writeAll(dataList);
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void writeDataOfLoginApi(String[] userData) {
        ArrayList<String[]> dataList = new ArrayList<String[]>();

        File file = new File(filePath);
        String headers[] = {"Object", "Description"};
        dataList.add(userData);
        this.writeDate(file, headers, dataList);
    }

    public List<String[]> readCsv() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(filePath));
            List<String[]> records = csvReader.readAll();
            csvReader.close();
            return records;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


    public static void modifyXML(String fileName,String desc) {
        try {

             String xmlFilePath = System.getProperty("user.dir") + "/src/main/resources/"+fileName+"/"+fileName+".xml";
            System.out.println(xmlFilePath);
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();

            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();

            Document document = documentBuilder.parse(xmlFilePath);


            Node employee = document.getElementsByTagName("Description").item(0);
            employee.setTextContent(desc);


            // write the DOM object to the file
                       TransformerFactory transformerFactory = TransformerFactory.newInstance();

            Transformer transformer = transformerFactory.newTransformer();
            DOMSource domSource = new DOMSource(document);

            StreamResult streamResult = new StreamResult(new File(xmlFilePath));
            transformer.transform(domSource, streamResult);

        } catch (ParserConfigurationException pce) {
            pce.printStackTrace();
        }  catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (SAXException sae) {
            sae.printStackTrace();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        List<String[]> list=new FileUtil().readCsv();
        for (int i=1;i<list.size();i++){
            String fileName=list.get(i)[0];
            String Desc=list.get(i)[1];
            modifyXML(fileName, Desc);
        }
    }
}
