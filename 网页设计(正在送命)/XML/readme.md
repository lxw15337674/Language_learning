##XML
	����:
		1.��Ϊ��������ļ�
		2.��ΪС�͵����ݿ�
###XML�﷨:
	1.���� XML Ԫ�ض����йرձ�ǩ
	2.XML ��ǩ�Դ�Сд����
	3.XML �ĵ������и�Ԫ��
	4.XML ������ֵ�������
	5.�� XML �У��ո�ᱻ����
####CDATA��
	����:������һЩ��Ҫ���а����������ַ�������ͳһ����ԭ�����.
###DOm������SAX����������
	1.Domԭ�� һ���Լ���xml�ĵ������ʺϴ��������ļ���ȡ
	  SAXԭ��:	����һ�㣬��ȡһ�㣬����һ�㡣�ʺϴ������ļ��Ķ�ȡ
	2.DOM�����������������ɾ�ĳ�
	  SAX����ֻ�ܶ�ȡ
	3.DOM���������ȡ�κ�λ�õ����ݣ��������ض�
	  SAX����ֻ�ܴ������£���˳���ȡ���������ض�
	4.DOM�����������ı�̷�����Node��Element��Attribute��,Java�����߱���Ƚϼ򵥡�
	  SAX���������¼��ı�̷�����java����������Ը���		
		
####��������
	DOM����:
		1.JAXP
		2.JDOM
		3.DOM4J
			������(Ĭ�϶�ȡxml�Ĺ��߾���DOM4J)
	SAX����:
		1.sax��������
###Dom����
####DOM4J
	��ȡ:
		�ڵ����:
			��ǩ�ڵ� 
			���Խڵ� 
			�ı��ڵ�
	ʹ�ò���:
		1.����jar��
		2.��д���Ĵ���
			//����һ��xml����������
			SAXReader reader = new SAXReader();
			//��ȡxml�ĵ�,����document����
			Document doc = reader.read(new File("src/day06/xml/lol.xml"));
	��Ҫ����:
		�ڵ㣺
			Iterator  Element.nodeIterator();  //��ȡ��ǰ��ǩ�ڵ��µ������ӽڵ�

		��ǩ��
			  Element  Document.getRootElement();  //��ȡxml�ĵ��ĸ���ǩ		
			 Element   ELement.element("��ǩ��") //ָ�����Ƶĵ�һ���ӱ�ǩ
			  Iterator<Element> Element.elementIterator("��ǩ��");// ָ�����Ƶ������ӱ�ǩ
				List<Element>	 Element.elements(); //��ȡ�����ӱ�ǩ
				
		���ԣ�
			String   Element.attributeValue("������") //��ȡָ�����Ƶ�����ֵ
			 Attribute    Element.attribute("������")��//��ȡָ�����Ƶ����Զ���	
					Attribute.getName()  //��ȡ��������
					Attibute.getValue()  //��ȡ����ֵ
			List<Attribute>	 Element.attributes();  //��ȡ�������Զ���
			Iterator<Attribute>		Element.attibuteIterator(); //��ȡ�������Զ���
		�ı���
			Element.getText();  //��ȡ��ǰ��ǩ���ı�
			Element.elementText("��ǩ��") //��ȡ��ǰ��ǩ��ָ�����Ƶ��ӱ�ǩ���ı�����
			
			
	�޸�xml�ĵ�
		д�����ݵ�xml�ĵ�
				XMLWriter writer = new XMLWriter(OutputStream, OutputForamt)
				wirter.write(Document);
		
		���XML�ĸ�ʽ:
			OutputFormat.createCompactFormat();//compact ���յ� Format ��ʽ  ȥ���ո��е������ʽ.��Ŀ���ߵ�ʱ��
			OutputFormat.createPrettyPrint();//Ư���ĸ�ʽ	�пո�ͻ��е������ʽ.�������Ե�ʱ��
		ָ�����ɵ�xml�ĵ�����(���ڱ���������������)
			format.setEncoding("utf-8")
			
		�޸�xml�ĵ���API
			���ӣ� 
				DocumentHelper.createDocument()  �����ĵ�
				addElement("����")  ���ӱ�ǩ
				addAttribute("����"����ֵ��)  ��������
			�޸ģ�
				Attribute.setValue("ֵ")  �޸�����ֵ
				Element.addAtribute("ͬ����������","ֵ")  �޸�ͬ��������ֵ
				Element.setText("����")  �޸��ı�����
			ɾ��
				Element.detach();  ɾ����ǩ  
				Attribute.detach();  ɾ������
####xPath
	����:
		��Ҫ�����ڿ��ٻ�ȡ����Ľڵ����
	��dom4j��ʹ��xpath:
		����:
			1.����jaxen��
			2.ʹ��xpath����
				List<Node>  selectNodes("xpath���ʽ");   ��ѯ����ڵ����
				Node       selectSingleNode("xpath���ʽ");  ��ѯһ���ڵ����
				
	�﷨
		/      ����·��      ��ʾ��xml�ĸ�λ�ÿ�ʼ����Ԫ�أ�һ����νṹ��
		//     ���·��       ��ʾ�����κβ�νṹ��ѡ��Ԫ�ء�
		*      ͨ���         ��ʾƥ������Ԫ��
		[]      ����           ��ʾѡ��ʲô�����µ�Ԫ��
		@     ����            ��ʾѡ�����Խڵ�
		and     ��ϵ          ��ʾ���������ϵ���ȼ���&&��
		text()    �ı�           ��ʾѡ���ı�����
###SAX����
	���ĵ�API��
		SAXParser�ࣺ ���ڶ�ȡ�ͽ���xml�ļ�����
			parse��File f, DefaultHandler dh�������� ����xml�ļ�
				����:
					File����ʾ ��ȡ��xml�ļ���
					DefaultHandler�� SAX�¼��������ʹ��DefaultHandler������
		
		DefaultHandlr��:
			startElement(String uri,String localName,String qName,Attributes attributes) ������ʼ��ǩʱ����
				����:
					qName:��ʾ��ʼ��ǩ�ı�ǩ��
					attributes:��ʾ��ʼ��ǩ�ڰ����������б�
			endElement(String uri,String localName,String qName) 						����������ǩʱ����
				����:
					qName:��ʾ������ǩ�ı�ǩ��
			characters(char[] ch,int start,int length) 									�����ı�����ʱ����
				����:
					ch:��ʾ��ǰ����������ı�����
					start:��ʾ��ǰ�ı����ݵĿ�ʼλ��
					length:��ʾ��ǰ�ı����ݵĳ���
	����:
		1.����SAXParser����
			SAXParser parser = SAXParserFactory.newInstance().newSAXParser();
        2.����parse����(����1:xml�ĵ�.����2:DefaultHandler������)
			parser.parse(new File("src/day07/SAX/lol.xml"), new MyDefaultHandler());

	