##XML
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
