##XML
	����:
		1.��Ϊ��������ļ�
		2.��ΪС�͵����ݿ�
	���ִ�Сд
####CDATA��
	����:������һЩ��Ҫ���а����������ַ�������ͳһ����ԭ�����.
####XML������ʽ(ԭ��ͬ)
	DOM����
	SAX����
####��������
	DOM����:
		1.JAXP
		2.JDOM
		3.DOM4J
			������(Ĭ�϶�ȡxml�Ĺ��߾���DOM4J)
	SAX����:
		1.sax��������
####DOM4J
	��ȡ:
		�ڵ�
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
	��dom4j��ʹ��xpath
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
